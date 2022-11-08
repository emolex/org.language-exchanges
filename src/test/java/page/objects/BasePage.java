package page.objects;

import config.ConfigurationProperties;
import config.PropertiesLoader;
import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import page.objects.register.RegisterPage;

import java.util.Properties;

import static navigation.ApplicationURLs.APPLICATION_URL;


public class BasePage {

    public LoginPage loginPage;
    public LandingPage landingPage;
    public RegisterPage registerPage;

    @BeforeTest
    public void SetUp() {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties propertiesFromFile = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(propertiesFromFile);
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        loginPage = new LoginPage();
        landingPage = new LandingPage();
        registerPage = new RegisterPage();
    }

    @BeforeMethod
    public void beforeTest() {
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @AfterTest
    public void afterTest() {
        DriverManager.disposeDriver();
    }


}
