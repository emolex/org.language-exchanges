package waits;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForIt {


    private static WebDriverWait getWebDriverWait() {
        return new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(20));
    }

    public static void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementIsClickable(WebElement element) {
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void sleep(int timeInMilliseconds) {
        try {
            Thread.sleep(timeInMilliseconds );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
