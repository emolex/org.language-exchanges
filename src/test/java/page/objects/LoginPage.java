package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static waits.WaitForIt.*;

public class LoginPage {


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

    public void asserrtion(WebElement actualElement, String expected) {
        String actualText = actualElement.getText();
        Assert.assertEquals(actualText, expected);
    }

    public void login(String login, String password) {
        waitUntilElementIsClickable(loginField);
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginInButton.click();
        asserrtion(alert, "×\n" +
                "Error message\n" +
                "Unrecognized username or password. Forgot your password?");
    }


}
