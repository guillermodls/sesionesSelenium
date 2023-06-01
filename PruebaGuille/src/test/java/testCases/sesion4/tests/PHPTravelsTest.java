package testCases.sesion4.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import testCases.sesion4.pages.LandingPage;
import testCases.sesion4.pages.LoginPage;
import testCases.sesion4.pages.MainPage;

public class PHPTravelsTest extends BaseTest {

    //PAGE OBJECT MODEL - el objetivo es crear una clase por cada pagina que tengo en mi aplicacion web / aplicacion mobile
    private static final String VALID_PASSWORD = "12345678";
    private static final String VALID_EMAIL = "rodrigo@ituarte.com";
    private static final String VALID_NAME = "O Rodriguinho";
    private static final String VALID_MESSAGE = "Ayudenme por favor quiero comprar un celular mas no me lo permiten";

    private static final String HOME_URL = "https://www.demoblaze.com/index.html";


    //private static final String HOME_URL = "https://demoblaze.com/index.html"

    @Test
    public void invalidLogIn() {
        landingPage.clickOnLogInButton();
        loginPage.loginUser("rodrigo@ituardes.com", "12345678");
        mainPage.verifyUnsuccessfulAlert();
    }

    @Test
    public void signingUp() {
        landingPage.clickOnSignUpButton();
        loginPage.signUpUser(VALID_EMAIL,VALID_PASSWORD);
        mainPage.verifySuccessfulAlert();
    }

    @Test
    public void validLogIn() {
        landingPage.clickOnLogInButton();
        loginPage.loginUser(VALID_EMAIL, VALID_PASSWORD);
        mainPage.verifySuccessfulLogin();
    }

    @Test
    public void goHome() {
        landingPage.clickOnLogInButton();
        loginPage.loginUser(VALID_EMAIL,VALID_PASSWORD);
        mainPage.verifySuccessfulLogin();
        mainPage.clickOnCartButton();
        mainPage.clickOnHomeButton();
        mainPage.VerifySuccessfulGoHome(HOME_URL);
        }
    @Test
    public void contactUs() {
        landingPage.clickOnLogInButton();
        loginPage.loginUser(VALID_EMAIL,VALID_PASSWORD);
        mainPage.verifySuccessfulLogin();
        mainPage.ClickOnContactButton();
        contactPage.fillContact(VALID_EMAIL,VALID_NAME,VALID_MESSAGE);
        contactPage.VerifySuccessfulContact();


    }

    }

