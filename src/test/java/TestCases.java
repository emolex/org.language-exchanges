import org.testng.annotations.Test;
import page.objects.BasePage;

public class TestCases extends BasePage {

    @Test
    public void registerUser() {
        landingPage.clickOnRegisterButton()
                .completeAllFieldsForRegister("dkyaogdjka1@op.pl","dblkausd5615","skypeName",
                        "187874141",
                        "https://zoom.us/meeting/piorunejro",
                        "someRegisterName")
                .clickOnCreateNewAccountButton()
                .checkAlert();
    }

    @Test
    public void loginWithWrongData() {
        landingPage.clickOnLoginButton()
                .login("Test", "test123");
    }

}
