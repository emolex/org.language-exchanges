package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "registerButton")
    private WebElement registerButton;

    @FindBy (id = "loginButton")
    private WebElement loginButton;


    public void clickOnRegisterButton () {
        registerButton.click();
    }

    public void clickOnLoginButton () {
        loginButton.click();
    }

}
