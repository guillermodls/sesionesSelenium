package testCases.sesion3;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PHPTravelsTest extends BaseTest {
    private static final String VALID_PASSWORD = "12345678";
    private static final String VALID_EMAIL = "rodrigo4@ituartevaldez.com";

    @Test
    public void invalidLogIn() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("login2"))));
        driver.findElement(By.id("login2")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("loginusername"))));
        driver.findElement(By.id("loginusername")).sendKeys("rodrigo@ituarte.com");
        driver.findElement(By.id("loginpassword")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();

        wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(driver.switchTo().alert().getText());

        Assert.assertTrue(driver.switchTo().alert().getText().contains("User does not exist."));
    }

    @Test
    public void signingUp() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("signin2"))));
        driver.findElement(By.id("signin2")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("sign-username"))));
        driver.findElement(By.id("sign-username")).sendKeys(VALID_EMAIL);
        driver.findElement(By.id("sign-password")).sendKeys(VALID_PASSWORD);
        driver.findElement(By.xpath("//button[@onclick='register()']")).click();

        wait.until(ExpectedConditions.alertIsPresent());

        Assert.assertTrue(driver.switchTo().alert().getText().contains("Sign up successful."));
    }

    @Test
    public void validLogIn() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("login2"))));
        driver.findElement(By.id("login2")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("loginusername"))));
        driver.findElement(By.id("loginusername")).sendKeys(VALID_EMAIL);
        driver.findElement(By.id("loginpassword")).sendKeys(VALID_PASSWORD);
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();

        try {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logout2"))));
        } catch (StaleElementReferenceException e) {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logout2"))));
        }

        Assert.assertTrue(driver.findElement(By.id("logout2")).isDisplayed());
    }
}
