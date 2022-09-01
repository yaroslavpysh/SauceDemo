package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @Test
    public void successLogin() {

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isOpened(), "Title of the page in not displayed");

    }

    @Test
    public void wrongPassword() {

        loginPage.open();
        loginPage.login("standard_user", "qweqr");
        Assert.assertEquals(loginPage.getError(),
                "Epic sadface: Username and password do not match any user in this service",
                "Wrong message shown");
    }

    @Test
    public void emptyUserName() {

        loginPage.open();
        loginPage.login("", "secret_sauce");
        Assert.assertEquals(loginPage.getError(),
                "Epic sadface: Username is required",
                "Wrong message shown");
    }
}
