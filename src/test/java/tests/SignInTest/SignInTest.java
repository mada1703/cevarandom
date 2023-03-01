package tests.SignInTest;


import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {

    @Test
    public void checkIfLogoIsDisplayed(){
        String email="grupa3@automation.com";

//        Log.info ("Verify if Logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

//        Log.info("Complete the email field");
        signInPage.typeinemailfield(email);

//        Log.info("Click the next button");
        signInPage.clicknextbutton();
    }
}
