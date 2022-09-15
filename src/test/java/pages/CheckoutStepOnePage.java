package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOnePage extends BasePage {

    private final By FIRSTNAME_INPUT = By.id("first-name");
    private final By LASTNAME_INPUT = By.id("last-name");
    private final By POSTALCODE_INPUT = By.id("postal-code");
    private final By PAGE_TITLE = By.xpath("//span[text()='Checkout: Your Information]");
    private final By CONTINUE_BUTTON = By.id("continue");
    private final By ERROR_MESSAGE = By.cssSelector("[data-test=error]");
    private final By CANCEL_BUTTON = By.cssSelector("[data-test=cancel]");

    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "checkout-step-one.html");

    }

    public boolean isOpened() {
        return waitForVisibility(PAGE_TITLE);

    }

    public void fillInformation(String firstName, String lastName, String postalCode) {
        driver.findElement(FIRSTNAME_INPUT).sendKeys(firstName);
        driver.findElement(LASTNAME_INPUT).sendKeys(lastName);
        driver.findElement(POSTALCODE_INPUT).sendKeys(postalCode);
        driver.findElement(CONTINUE_BUTTON).click();
    }

    public String getError() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }

}
