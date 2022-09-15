package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage extends BasePage {
    private final By PAGE_TITLE = By.xpath("//span[text()='Checkout: Complete!']");


    public boolean isOpened() {
        return waitForVisibility(PAGE_TITLE);

    }

    public FinishPage(WebDriver driver) {
        super(driver);
    }
}
