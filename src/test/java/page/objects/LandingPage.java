package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForIt;
import static waits.WaitForIt.*;

public class LandingPage {

    public LandingPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(id = "registerButton")
    protected WebElement registerButton;

    @FindBy (id = "loginButton")
    protected WebElement loginButton;


    public void clickOnRegisterButton () {
        waitUntilElementIsClickable(registerButton);
        registerButton.click();
    }

    public void clickOnLoginButton () {
        waitUntilElementIsClickable(loginButton);
        loginButton.click();
    }

}
