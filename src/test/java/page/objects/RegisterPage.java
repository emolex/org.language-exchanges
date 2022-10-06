package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static driver.manager.DriverUtils.asserrtion;
import static waits.WaitForIt.*;

public class RegisterPage {

    @FindBy(id = "edit-mail")
    private WebElement emailAddress;

    @FindBy(id = "edit-name")
    private WebElement username;

    @FindBy(id = "edit-field-skype-name-0-value")
    private WebElement skypeNameField;

    @FindBy(id="edit-field-whatsapp-0-value")
    private WebElement whatsUpField;

    @FindBy (id="edit-field-zoom-room-0-uri")
    private WebElement zoomRoomField;

    @FindBy(id="edit-field-name-0-value")
    private WebElement registerNameField;

    @FindBy (id ="edit-field-age")
    private WebElement ageField;
    public Select ageSelect;

    @FindBy (id="edit-field-country")
    public WebElement countryField;
    public Select countrySelect;

    @FindBy (id="edit-field-language-sought")
    public WebElement LearningLanguageField;
    public Select learningLanguageSelect;

    @FindBy (id = "edit-field-native-language")
    public WebElement nativeLanguageField;
    public Select nativeLanguageSelect;

    @FindBy (xpath = "//*[@title='Rich Text Editor, Reason for learning a language field']")
    public WebElement reasonForLearningALanguageFrame;

    @FindBy (xpath = "//*[@title='Rich Text Editor, Days/times when available for exchange field']")
    public WebElement dayTimesAvailableForExchangeFrame;


    @FindBy (id = "edit-field-appear-in-search")
    public WebElement appearInSearchField;
    Select appearInSearchSelect;

    @FindBy (id = "edit-field-i-agree")
    WebElement siteTermsField;
    Select siteTermsSelect;

    @FindBy (id = "edit-submit")
    WebElement createNewAccountButton;

    @FindBy (xpath = "//*[@class = 'alert alert-success alert-dismissible']")
    WebElement alert;

    public RegisterPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public RegisterPage completeAllFieldsForRegister (String email, String user, String skypeName, String whatsUp, String zoomRoom, String registerName) {
        ageSelect = new Select (ageField);
        countrySelect = new Select (countryField);
        learningLanguageSelect = new Select (LearningLanguageField);
        nativeLanguageSelect = new Select (nativeLanguageField);
        appearInSearchSelect = new Select(appearInSearchField);
        siteTermsSelect = new Select(siteTermsField);

        waitUntilElementIsVisible(skypeNameField);
        emailAddress.sendKeys(email);
        username.sendKeys(user);
        skypeNameField.sendKeys(skypeName);
        whatsUpField.sendKeys(whatsUp);
        zoomRoomField.sendKeys(zoomRoom);
        registerNameField.sendKeys(registerName);
        ageField.click();
        ageSelect.selectByValue("17");
        countryField.click();
        countrySelect.selectByValue("Benin");
        LearningLanguageField.click();
        learningLanguageSelect.selectByValue("Hindi");
        nativeLanguageField.click();
        nativeLanguageSelect.selectByValue("Mongolian");
        appearInSearchField.click();
        appearInSearchSelect.selectByValue("No");
        reasonForLearningALanguageFrame.click();
        sleep(1000);
        new Actions(DriverManager.getWebDriver()).sendKeys("abc...").perform();
        dayTimesAvailableForExchangeFrame.click();
        sleep(1000);
        new Actions(DriverManager.getWebDriver()).sendKeys("1").perform();
        siteTermsField.click();
        siteTermsSelect.selectByValue("0");

        return new RegisterPage();
    }

    public RegisterPage clickOnCreateNewAccountButton() {
        createNewAccountButton.click();
        return new RegisterPage();
    }

    public void checkAlert () {
        asserrtion(alert, "×\n" +
                "Status message\n" +
                "A welcome message with further instructions has been sent to your email address.");
    }


}
