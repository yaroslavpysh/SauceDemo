import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class SearchLocators extends BaseTest {
    @Test
    public void login(){
        driver.get("https://www.saucedemo.com/");
        driver.findElements(By.id("login-button"));
        driver.findElement(By.name("password"));

        driver.findElements(By.className("submit-button"));
        String discountCash = driver.findElement(By.xpath("//login_credentials/Accepted usernames are:")).getText();
        driver.findElement(By.name("login")).sendKeys(discountCash);

    }

}
