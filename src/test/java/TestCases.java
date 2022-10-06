import org.testng.annotations.Test;
import page.objects.BasePage;

public class TestCases extends BasePage {

    @Test
    public void registerUser() {
        landingPage.clickOnRegisterButton()
                        .completeAllFieldsForRegister("skypeName","187874141","someZoomRoom",
                "someRegisterName");
    }

    @Test
    public void loginWithWrongData() {
        landingPage.clickOnLoginButton()
                .login("Test", "test123");
    }

}
