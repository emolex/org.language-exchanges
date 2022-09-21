package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


}
