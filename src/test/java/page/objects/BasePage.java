package page.objects;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BasePage {

    public LoginPage loginPage;
    public LandingPage landingPage;

    @BeforeTest
    public void SetUp() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        loginPage = new LoginPage();
        landingPage = new LandingPage();
    }

    @BeforeMethod
    public void beforeTest() {
        DriverUtils.navigateToPage("https://www.language-exchanges.org/");


    }

    @AfterTest
    public void afterTest() {
        DriverManager.disposeDriver();
    }


}
