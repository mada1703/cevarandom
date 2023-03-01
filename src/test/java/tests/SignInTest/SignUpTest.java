package tests.SignInTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUpTest extends BaseTest {

    @Test
    public void signUp(){
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Sign in is not displayed");
        Assert.assertTrue(signInPage.skipSignInButtonDisplayed(), "skip Sing in is not displayed");
        signInPage.clickSignInButton();
    }
}
