package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckPrice extends BaseTest {
    @Test
    public void checkNameOfProducts() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckout();
        checkoutStepOnePage.fillInformation("abc", "abc", "123");
        Assert.assertEquals(checkoutStepTwoPage.getProductName(), "Sauce Labs Backpack",
                "Product name is not correct");

    }

    @Test
    public void checkPriceOfProducts() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckout();
        checkoutStepOnePage.fillInformation("abc", "abc", "123");
        Assert.assertEquals(checkoutStepTwoPage.getProductPrice(), "$29.99",
                "Product price is not correct");

    }

    @Test
    public void checkItemTotalPrice() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckout();
        checkoutStepOnePage.fillInformation("abc", "abc", "123");
        Assert.assertEquals(checkoutStepTwoPage.getItemTotal(), "Item total: $29.99",
                "Item total is not correct");

    }

    @Test
    public void checkTax() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckout();
        checkoutStepOnePage.fillInformation("abc", "abc", "123");
        Assert.assertEquals(checkoutStepTwoPage.getTax(), "Tax: $2.40",
                "Tax is not correct");

    }

    @Test
    public void checkTotal() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckout();
        checkoutStepOnePage.fillInformation("abc", "abc", "123");
        Assert.assertEquals(checkoutStepTwoPage.getTotal(), "Total: $32.39",
                "Total is not correct");

    }
}
