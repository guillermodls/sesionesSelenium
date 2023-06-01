package testCases.sesion4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class ContactPage extends BasePage {


    public ContactPage(WebDriver remoteDriver) {
        super(remoteDriver);
    }

    public void fillContact(String email, String name, String message) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("recipient-email"))));
        driver.findElement(By.id("recipient-email")).sendKeys(email);
        driver.findElement(By.id("recipient-name")).sendKeys(name);
        driver.findElement(By.id("message-text")).sendKeys(message);
        driver.findElement(By.xpath(".//button[contains(@onclick, 'send()')]")).click();
    }

    public void VerifySuccessfulContact() {
        Assert.assertTrue(driver.switchTo().alert().getText().contains("Thanks for the message!!"));
        driver.switchTo().alert().accept();
    }
}


