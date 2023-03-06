package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SignUpTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);
    private String newUrl = getBaseUrl() + "Index.html";

    //metoda prin care se foloseste de locatori si actiuni din signinpage.java
    @Test
    public void signUp() {
        String email = "email@example.com";
        String password = "12345";
//prima pagina
        LOG.info("Navigate to Sign Up Page");
        driver.get(newUrl);
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Sign in is not displayed");
        Assert.assertTrue(signInPage.skipSignInButtonDisplayed(), "skip Sing in is not displayed");
        signInPage.clickSignInButton();

        //a doua pagina Sign in
        LOG.info("Type in email and pass");
        signInPage.typeInSignInEmailfield(email);
        signInPage.typeInSignInPasswordfield(password);

        LOG.info("click 'enter' button");
        signInPage.clickenterButton();

        LOG.info("Veryfing if error message is displayed");
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error message is not displayed");
    }
}
