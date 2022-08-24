package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private final By PAGE_TITLE = By.cssSelector(".title");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "inventory.html");
    }

    public boolean isOpened() {
        return driver.findElement(PAGE_TITLE).isDisplayed();
    }

    public void addToCart(String product) {
//        String.format("Helo %s%s", "ads","asd")
        String locator = String.format("//*[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item']//button",
                product);
        driver.findElement((By.xpath(locator))).click();
    }

}
