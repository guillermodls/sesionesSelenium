package testCases.sesion4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage extends BasePage{


    public LandingPage (WebDriver remoteDriver){
        super(remoteDriver);
    }

    public void clickOnLogInButton(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("login2"))));
        driver.findElement(By.id("login2")).click();
    }

    public void clickOnSignUpButton(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("signin2"))));
        driver.findElement(By.id("signin2")).click();
    }
}
