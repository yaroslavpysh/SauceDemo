package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductTest extends BaseTest {

    @Test(description = "Check is price of product is correct in the Cart")//(enable=false) - выключение теста, (description = "Chec
    public void buyProduct(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        assertTrue(productsPage.isOpened(), "Title of the page in not displayed");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        assertTrue(cartPage.isOpened(), "Cart page was not opened");
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Backpack"), "$29.99",
                "Product price is not correct");

    }

}
