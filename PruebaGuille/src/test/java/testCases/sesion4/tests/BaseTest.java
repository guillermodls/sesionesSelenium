package testCases.sesion4.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import testCases.sesion4.pages.*;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    LandingPage landingPage;
    LoginPage loginPage;
    MainPage mainPage;
    ContactPage contactPage;

    AboutUsPage aboutUsPage;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        landingPage = new LandingPage(driver);
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        contactPage = new ContactPage(driver);
        aboutUsPage = new AboutUsPage(driver);
    }

    @AfterMethod
    public void tearDown(){
        try{
            Thread.sleep(5000);
        }catch (Exception ignored){

        }
        driver.quit();
    }
}
