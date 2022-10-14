package page.objects.register;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterWebElements {
    @FindBy(id = "edit-mail")
    protected WebElement emailAddress;

    @FindBy(id = "edit-name")
    protected WebElement username;

    @FindBy(id = "edit-field-skype-name-0-value")
    protected WebElement skypeNameField;

    @FindBy(id="edit-field-whatsapp-0-value")
    protected WebElement whatsUpField;

    @FindBy (id="edit-field-zoom-room-0-uri")
    protected WebElement zoomRoomField;

    @FindBy(id="edit-field-name-0-value")
    protected WebElement registerNameField;

    @FindBy (id ="edit-field-age")
    protected WebElement ageField;
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


}
