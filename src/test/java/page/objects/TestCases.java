package page.objects;

import org.testng.annotations.Test;

public class TestCases extends BasePage {

    @Test
    public void registerUser() {
        landingPage.clickOnRegisterButton();
    }
    @Test
    public void loginWithWrongData () {
        landingPage.clickOnLoginButton();
        loginPage.login("Test", "test123");

    }

}
