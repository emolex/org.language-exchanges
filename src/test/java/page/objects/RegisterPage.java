package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static waits.WaitForIt.*;

public class RegisterPage {


    @FindBy(id = "edit-field-skype-name-0-value")
    private WebElement skypeNameField;

    @FindBy(id="edit-field-whatsapp-0-value")
    private WebElement whatsupField;

    @FindBy (id="edit-field-zoom-room-0-uri")
    private WebElement zoomRoomField;

    @FindBy(id="edit-field-name-0-value")
    private WebElement registerNameField;

    @FindBy (id ="edit-field-age")
    private WebElement ageField;
    public Select ageDropDown;

    @FindBy (id="edit-field-country")
    public WebElement countryField;
    public Select countryDropDown;

    @FindBy (id="edit-field-language-sought")
    public WebElement LearningLanguageField;
    public Select learningLanguageDropDown;

    @FindBy (id = "edit-field-native-language")
    public WebElement nativeLanguageField;
    public Select nativeLanguageDropDown ;

    @FindBy (xpath = "//*[@class='cke_wysiwyg_frame cke_reset']")
    public WebElement reasonForLearningALanguageFrame;

    public RegisterPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public void completeAllFieldsForRegister (String skypeName, String whatsUp, String zoomRoom, String registerName) {
        ageDropDown = new Select (ageField);
        countryDropDown = new Select (countryField);
        learningLanguageDropDown = new Select (LearningLanguageField);
        nativeLanguageDropDown = new Select (nativeLanguageField);

        waitUntilElementIsVisible(skypeNameField);
        skypeNameField.sendKeys(skypeName);
        whatsupField.sendKeys(whatsUp);
        zoomRoomField.sendKeys(zoomRoom);
        registerNameField.sendKeys(registerName);
        ageField.click();
        ageDropDown.selectByValue("17");
        countryField.click();
        countryDropDown.selectByValue("Benin");
        LearningLanguageField.click();
        learningLanguageDropDown.selectByValue("Hindi");
        nativeLanguageField.click();
        nativeLanguageDropDown.selectByValue("Mongolian");
        reasonForLearningALanguageFrame.click();
        reasonForLearningALanguageFrame.sendKeys("abc...");
    }

}
