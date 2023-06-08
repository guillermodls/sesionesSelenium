package testCases.sesion4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AboutUsPage extends BasePage {

    public AboutUsPage(WebDriver remoteDriver) {
        super(remoteDriver);
    }


    public void VerifyAboutUs(){
        try {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("example-video_html5_api"))));
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("example-video_html5_api"))));
        }
        Assert.assertTrue(driver.findElement(By.id("example-video_html5_api")).isDisplayed());
    }

}
