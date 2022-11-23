package sel4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_ManagerTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    void Login() throws InterruptedException {
        //WebDriverManager.chromedriver().setup(); //not required from 4.6.0
        //driver = new ChromeDriver();

        //WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void Test_Something(){
        //wait for the products text
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-button")));
    }
}
