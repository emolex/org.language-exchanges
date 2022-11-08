package driver.manager;
import config.AppProperties;
import org.openqa.selenium.WebDriver;

import static driver.manager.BrowserType.*;


public class DriverManager {
    private static WebDriver driver;
//    private static final BrowserType BROWSER_TYPE= CHROME;

    private DriverManager () {

    }

    public static WebDriver getWebDriver () {

        if (driver == null) {
            driver = BrowserFactory.getBrowser(AppProperties.getBrowserType());
        }
        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        if (!AppProperties.getBrowserType().equals(FIREFOX)){
            driver.quit();
        }
        driver = null;
    }

}
