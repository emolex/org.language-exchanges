package page.objects;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static driver.manager.DriverUtils.asserrtion;
import static waits.WaitForIt.*;

public class LoginPage {

    Logger logger = LogManager.getRootLogger();

    @FindBy(id = "edit-name")
    WebElement loginField;
    @FindBy(id = "edit-pass")
    WebElement passwordField;
    @FindBy(id = "edit-submit")
    WebElement loginInButton;
    @FindBy(xpath = "//*[@role='alert']")
    WebElement alert;

    public LoginPage() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

//    public void asserrtion(WebElement actualElement, String expected) {
//        String actualText = actualElement.getText();
//        Assert.assertEquals(actualText, expected);
//    }

    public void login(String login, String password) {
        logger.info("Trying to type login...{}");
        waitUntilElementIsClickable(loginField);
        loginField.sendKeys(login);
        logger.info("Trying to type password...{}");
        passwordField.sendKeys(password);
        logger.info("Trying to login...{}");
        loginInButton.click();
        logger.info("Checking displayed alert...{}", alert);
        asserrtion(alert, "×\n" +
                "Error message\n" +
                "Unrecognized username or password. Forgot your password?");
    }


}
