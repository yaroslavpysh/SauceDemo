package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOnePage extends BasePage{

    private final By FIRST_NAME = By.id("first-name");
    private final By LAST_NAME = By.id("last-name");
    private final By POSTAL_CODE = By.id("postal-code");
    private final By PAGE_TITLE = By.xpath("//span[text()='Checkout: Overview']");
    private final By CONTINUE_BUTTON = By.cssSelector("[data-test=continue]");
    private final By ERROR_MESSAGE = By.cssSelector("[data-test=error]");
    private final By CANCEL_BUTTON = By.cssSelector("[data-test=cancel]");

    public CheckoutStepOnePage(WebDriver driver){
        super(driver);
    }

        public void open(){
            driver.get(BASE_URL + "checkout-step-one.html");

    }

    public boolean isOpened(){
        return driver.findElement(PAGE_TITLE).isDisplayed();
    }

    public void fillInformation(String firstName, String lastName, String postalCode){
        driver.findElement(FIRST_NAME).sendKeys(firstName);
        driver.findElement(LAST_NAME).sendKeys(lastName);
        driver.findElement(POSTAL_CODE).sendKeys(postalCode);
        driver.findElement(CONTINUE_BUTTON).click();
    }
    public String getError(){
        return driver.findElement(ERROR_MESSAGE).getText();
    }

}
