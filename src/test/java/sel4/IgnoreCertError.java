package sel4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.security.Security;
//import org.openqa.selenium.devtools.v102.security.Security;
import org.openqa.selenium.devtools.v107.security.Security;
import org.testng.annotations.Test;

public class IgnoreCertError {
WebDriver driver;
DevTools devTools;

    @Test
    public void Test_IgnoreSSLError() throws InterruptedException {

        driver = new ChromeDriver();
        devTools = ((ChromeDriver)driver).getDevTools();

        driver.get("https://expired.badssl.com/");
        Thread.sleep(2000);

        devTools.send(Security.enable());
        devTools.send(Security.setIgnoreCertificateErrors(true));

        driver.get("https://expired.badssl.com/");

        Thread.sleep(3000);

        driver.quit();


    }
}
