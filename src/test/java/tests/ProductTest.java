package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void buyProduct(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Backpack"), "$29.99",
                "Product price is not correct");
    }

}
