package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void successFillInformation() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckout();
        checkoutStepOnePage.fillInformation("abc", "abc", "123");
        checkoutStepTwoPage.isOpened();
        Assert.assertTrue(productsPage.isOpened(), "Title of the checkout page in not displayed");
        checkoutStepTwoPage.clickFinish();
        Assert.assertTrue(finishPage.isOpened(), "Title of the checkout page in not displayed");
    }

    @Test
    public void emptyFirstName() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckout();
        checkoutStepOnePage.fillInformation("", "abc", "123");
        Assert.assertEquals(checkoutStepOnePage.getError(),
                "Error: First Name is required",
                "Wrong message shown");

    }

    @Test
    public void emptyLastName() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckout();
        checkoutStepOnePage.fillInformation("abc", "", "123");
        Assert.assertEquals(checkoutStepOnePage.getError(),
                "Error: Last Name is required",
                "Wrong message shown");

    }

    @Test
    public void emptyPostalCode() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.clickCart();
        cartPage.clickCheckout();
        checkoutStepOnePage.fillInformation("abc", "abc", "");
        Assert.assertEquals(checkoutStepOnePage.getError(),
                "Error: Postal Code is required",
                "Wrong message shown");

    }
}
