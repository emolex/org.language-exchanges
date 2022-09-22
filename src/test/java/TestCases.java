import org.testng.annotations.Test;
import page.objects.BasePage;

public class TestCases extends BasePage {

    @Test
    public void registerUser() {
        landingPage.clickOnRegisterButton();
        registerPage.completeAllFieldsForRegister("skypeName","187874141","someZoomRoom",
                "someRegisterName");
    }

    @Test
    public void loginWithWrongData() {
        landingPage.clickOnLoginButton();
        loginPage.login("Test", "test123");

    }

}
