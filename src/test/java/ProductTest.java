import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{

    @Test
    public void buyProduct(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id(("user-name"))).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).submit(); //or .click();
        driver.findElement(By.className("inventory_item"));
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item']//button"));
        driver.findElement(By.id("shopping_cart_container")).click();
        String price = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div[@class='cart_item']//div[@class='cart_item_label']")).getText();
        Assert.assertEquals(price,"$29.99");

    }

}
