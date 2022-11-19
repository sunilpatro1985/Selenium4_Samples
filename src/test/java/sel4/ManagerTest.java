package sel4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ManagerTest {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeMethod
    void Login() throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://qavbox.github.io/demo/webtable/");
        Thread.sleep(2000);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void Test_getRect() throws InterruptedException {
        System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));


    }
}
