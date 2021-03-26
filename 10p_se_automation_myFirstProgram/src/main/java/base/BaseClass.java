package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public WebDriver driver;

    static{
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\broswerDrivers\\chromedriver.exe");
    }

    public BaseClass(){
        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void openHomePage(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void quitBrowser(){
        driver.quit();
    }

}
