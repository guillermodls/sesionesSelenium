package testCases.sesion4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class MainPage extends BasePage {

    public MainPage(WebDriver remoteDriver) {
        super(remoteDriver);
    }

    public void verifyUnsuccessfulAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertTrue(driver.switchTo().alert().getText().contains("User does not exist."));
    }

    public void verifySuccessfulAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertTrue(driver.switchTo().alert().getText().contains("Sign up successful."));

    }

    public void verifySuccessfulLogin() {
        try {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logout2"))));
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logout2"))));
        }
        Assert.assertTrue(driver.findElement(By.id("logout2")).isDisplayed());

    }

    public void clickOnHomeButton() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("Home"))));
        driver.findElement(By.partialLinkText("Home")).click();
        //driver.findElement(By.className("nav-link")).click();
    }

    public void clickOnCartButton() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cartur"))));
        driver.findElement(By.id("cartur")).click();
    }

    public void VerifySuccessfulGoHome(String home) {
        Assert.assertEquals(driver.getCurrentUrl(),home);
    }

    public void ClickOnContactButton() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Contact"))));
        driver.findElement(By.linkText("Contact")).click();

    }

}