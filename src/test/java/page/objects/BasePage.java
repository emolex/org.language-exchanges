package page.objects;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

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
