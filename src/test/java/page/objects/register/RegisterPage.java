package page.objects.register;

import driver.manager.DriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static driver.manager.DriverUtils.asserrtion;
import static waits.WaitForIt.*;

public class RegisterPage extends RegisterWebElements{

    public RegisterPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public RegisterPage completeAllFieldsForRegister (String email, String user, String skypeName, String whatsUp
            , String zoomRoom, String registerName) {
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
        sleep(500);
        new Actions(DriverManager.getWebDriver()).sendKeys("abc...").perform();
        dayTimesAvailableForExchangeFrame.click();
        sleep(500);
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
