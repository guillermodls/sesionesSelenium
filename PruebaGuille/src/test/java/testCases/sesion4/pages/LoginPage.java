package testCases.sesion4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    @FindBy (id = "loginusername")
    public WebElement loginUserNameField;

    @FindBy (id = "loginpassword")
    public WebElement loginPasswordField;

    @FindBy (xpath = "//button[@onclick='logIn()']")
    public WebElement logInButton;

    @FindBy (id = "sign-username")
    public WebElement signUpUserNameField;

    @FindBy (id = "sign-password")
    public WebElement signUpPasswordField;

    @FindBy (xpath = "//button[@onclick='register()']")
    public WebElement signUpButton;

    public LoginPage (WebDriver remoteDriver){
        super(remoteDriver);
        PageFactory.initElements(driver, this);
    }
    public void loginUser(String email, String password){
        wait.until(ExpectedConditions.elementToBeClickable(loginUserNameField));
        loginUserNameField.sendKeys(email);
        loginPasswordField.sendKeys(password);
        logInButton.click();
    }

    public void signUpUser(String email, String password){
        wait.until(ExpectedConditions.elementToBeClickable(signUpUserNameField));
        signUpUserNameField.sendKeys(email);
        signUpPasswordField.sendKeys(password);
        signUpButton.click();
    }
}
