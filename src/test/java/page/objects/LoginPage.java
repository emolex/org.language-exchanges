package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }

    @FindBy (id = "edit-name")
    WebElement loginField;

    @FindBy (id = "edit-pass")
    WebElement passwordField;

    @FindBy(id = "edit-submit")
    WebElement loginInButton;

    @FindBy(xpath = "//*[@role='alert']")
    WebElement alert;

    public void asserrtion (WebElement actualElement, String expected ) {
        String actualText = actualElement.getText().toString();
        Assert.assertEquals(actualText, expected);
    }

    public void login (String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginInButton.click();
        asserrtion(alert, "×\n" +
                "Error message\n" +
                "Unrecognized username or password. Forgot your password?");
    }


}
