package testCases.sesion3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        //un wait que es el wait implicito y el wait explicito.

        //EXPLICITO - espera hasta la totalidad de tiempo que le pasas por parametro, pero si la condicion se cumple
        //entonces deja de esperar.
        wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(100));



        //IMPLICITO - esperar por la totalidad del tiempo que vos le pasas en el parametro.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    @AfterMethod
    public void tearDown() {
        try{
            Thread.sleep(5000);
        }catch (Exception ignored){

        }
        driver.quit();
    }
}
