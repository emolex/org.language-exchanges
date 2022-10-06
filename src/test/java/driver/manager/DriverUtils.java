package driver.manager;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DriverUtils {

    public static void setInitialConfiguration() {
//        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        DriverManager.getWebDriver().manage().window().maximize();
    }

    public static void navigateToPage(String pageUrl) {
        DriverManager.getWebDriver().navigate().to(pageUrl);
    }

    public static void asserrtion(WebElement actualElement, String expected) {
        String actualText = actualElement.getText();
        Assert.assertEquals(actualText, expected);
    }

}
