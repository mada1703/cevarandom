package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void checkIfLogoIsDisplayed(){
        String email="grupa3@automation.com";

        LOG.info ("Verify if Logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Complete the email field");
        signInPage.typeinemailfield(email);

        LOG.info("Click the next button");
        signInPage.clicknextbutton();
    }
}
