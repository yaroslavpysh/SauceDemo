package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoPage extends BasePage {

    private final By PAGE_TITLE = By.xpath("//span[text()='Checkout: Overview']");
    private final By PRODUCT_NAME = By.xpath("//div[@class = 'inventory_item_name']");
    private final By PRODUCT_PRICE = By.xpath("//div[@class = 'inventory_item_price']");
    private final By ITEM_TOTAL = By.xpath("//div[@class = 'summary_subtotal_label']");
    private final By TAX = By.xpath("//div[@class = 'summary_tax_label']");
    private final By TOTAL = By.xpath("//div[@class = 'summary_total_label']");
    private final By FINISH_BUTTON = By.id("finish");


    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
    }


    public void open() {
        driver.get(BASE_URL + "checkout-step-two.html");

    }

    public boolean isOpened() {
        return waitForVisibility(PAGE_TITLE);

    }

    public String getProductName() {
        return driver.findElement(PRODUCT_NAME).getText();

    }

    public String getProductPrice() {
        return driver.findElement(PRODUCT_PRICE).getText();

    }

    public String getItemTotal() {
        return driver.findElement(ITEM_TOTAL).getText();

    }

    public String getTax() {
        return driver.findElement(TAX).getText();

    }

    public String getTotal() {
        return driver.findElement(TOTAL).getText();

    }

    public void clickFinish() {
        driver.findElement(FINISH_BUTTON).click();
    }

}
