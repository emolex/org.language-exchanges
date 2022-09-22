package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static waits.WaitForIt.*;

public class LandingPage {
    private Logger logger = LogManager.getRootLogger();
    public LandingPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(id = "registerButton")
    private WebElement registerButton;

    @FindBy (id = "loginButton")
    private WebElement loginButton;


    public void clickOnRegisterButton () {
        waitUntilElementIsClickable(registerButton);
        registerButton.click();
        logger.info("Trying to click on register button...{}");
    }

    public void clickOnLoginButton () {
        waitUntilElementIsClickable(loginButton);
        loginButton.click();
        logger.info("Trying to click on login button one the land...{}");
    }

}
