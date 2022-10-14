package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.objects.register.RegisterPage;

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


    public RegisterPage clickOnRegisterButton () {
        waitUntilElementIsClickable(registerButton);
        registerButton.click();
        logger.info("Trying to click on register button...{}");
        return new RegisterPage();
    }

    public LoginPage clickOnLoginButton () {
        waitUntilElementIsClickable(loginButton);
        loginButton.click();
        logger.info("Trying to click on login button one the land...{}");
        return new LoginPage();
    }

}
