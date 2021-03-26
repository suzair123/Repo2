package pageObject;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScreen extends BaseClass {
    WebDriver driver = getDriver();

    public String invalidCredentials(String Username, String Pass)
    {
        driver.findElement(By.id("txtUsername")).click();
        driver.findElement(By.id("txtUsername")).sendKeys(Username);
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys(Pass);
        driver.findElement(By.name("Submit")).click();
        String invalidText = driver.findElement(By.id("spanMessage")).getText();

    return invalidText;
    }
}
