package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @Test
    public void successLogin() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isOpened(), "Title of the page in not displayed");

    }

    @Test(dataProvider = "loginData")
    public void negativeLogin(String userName, String password, String error) {
        loginPage.open();
        loginPage.login(userName, password);
        Assert.assertEquals(loginPage.getError(),
                error,
                "Wrong message shown");
    }
//
//    @Test
//    public void emptyUserName() {
//        loginPage.open();
//        loginPage.login("", "secret_sauce");
//        Assert.assertEquals(loginPage.getError(),
//                "Epic sadface: Username is required",
//                "Wrong message shown");
//    }
//
//    @Test
//    public void emptyPassword() {
//        loginPage.open();
//        loginPage.login("standard_user", "");
//        Assert.assertEquals(loginPage.getError(),
//                "Epic sadface: Password is required",
//                "Wrong message shown");
//    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "qweqr", "Epic sadface: Username and password do not match any user in this service"},
                {"", "secret_sauce", "Epic sadface: Username is required"},
                {"standard_user", "", "Epic sadface: Password is required" }
        };
    }

}
