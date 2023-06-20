package conf;

import org.openqa.selenium.WebDriver;

public class BaseClass {

    public static WebDriver driver;


    public static void BeforParent() {
        driver = ConfiguretionWebDriver.createDriver(WebDrivers.CHROME_INCOGNITO);

    }


    public static void afterParent() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
