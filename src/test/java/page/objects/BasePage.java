package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BasePage {

    private WebDriver driver;

     LoginPage  loginPage;
    LandingPage landingPage;


    @BeforeTest
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
        landingPage = new LandingPage(driver);
    }

    @BeforeMethod
    public void beforeTest() {
        driver.navigate().to("https://www.language-exchanges.org/");



    }

    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();
    }


}
