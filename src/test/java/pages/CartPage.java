package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private final By CHECKOUT_BUTTON = By.id("checkout");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpened() {
        return waitForVisibility(CHECKOUT_BUTTON);

    }

    public void open() {
        driver.get(BASE_URL + "cart.html");
    }

    public String getProductPrice(String product) {
        String locator = String.format("//div[text()='%s']//ancestor::div[@class='cart_item']//div[@class='cart_item_label']",
                product);
        return driver.findElement(By.xpath(locator)).getText();

    }

    public void clickCheckout() {
        driver.findElement(CHECKOUT_BUTTON).click();

    }
}
