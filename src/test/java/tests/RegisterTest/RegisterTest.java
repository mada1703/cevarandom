package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    private String newUrl = getBaseUrl() + "Register.html";
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);

    @Test
    public void register(){
        driver.get(newUrl);

        String firstName = "Madalin";
        String lastName = "Enache";
        String address = "Craiova, str.Craiovei, nr.173";
        String email = "madalinenache91@gmail.com";
        String phone = "0728078278";
        String language = "Romanian";

        LOG.info("Check title");
        Assert.assertTrue(registerPage.isTitleDisplayed(), "Title is not displayed");

        LOG.info("Check title2");
        Assert.assertTrue(registerPage.isTitleDisplayed(), "Title2 is not displayed");

        LOG.info("Check FirstName");
        Assert.assertTrue(registerPage.isFirstNamefielddisplayed(), "First Name field is not displayed");

        LOG.info("Type in Fullname");
        registerPage.typeInFirstName(firstName);
        registerPage.typeInLastName(lastName);

        LOG.info("Check LastName");
        Assert.assertTrue(registerPage.isLastNamefielddisplayed(), "Last Name field is not displayed");

        LOG.info("Check Address");
        Assert.assertTrue(registerPage.isAddressfielddisplayed(), "Address field is not displayed");

        LOG.info("Type in Address");
        registerPage.typeInAddress(address);

        LOG.info("Check Email");
        Assert.assertTrue(registerPage.isEmailfielddisplayed(), "Email field is not displayed");

        LOG.info("Type in Email");
        registerPage.typeInEmail(email);

        LOG.info("Check Phone");
        Assert.assertTrue(registerPage.isPhonefielddisplayed(), "Phone field is not displayed");

        LOG.info("Type in Phone");
        registerPage.typeInPhone(phone);

        LOG.info("Check Male");
        Assert.assertTrue(registerPage.isMalecheckmarkdisplayed(), "Male checkmark is not displayed");

        LOG.info("Check Female");
        Assert.assertTrue(registerPage.isFemalecheckmarkdisplayed(), "Female checkmark is not displayed");

        LOG.info("Check Cricket");
        Assert.assertTrue(registerPage.isCricketcheckmarkdisplayed(), "Cricket checkmark is not displayed");

        LOG.info("Check Movies");
        Assert.assertTrue(registerPage.isMoviescheckmarkdisplayed(), "Movies checkmark is not displayed");

        LOG.info("Check Hockey");
        Assert.assertTrue(registerPage.isHockeycheckmarkdisplayed(), "Hockey checkmark is not displayed");

        LOG.info("Check Languages");
        Assert.assertTrue(registerPage.isLanguagesdropdowndisplayed(), "Languages dropdown is not displayed");

        LOG.info("Select a Language");
        registerPage.selectLanguage(language);

        LOG.info("Check Skills");
        Assert.assertTrue(registerPage.isSkillsdropdowndisplayed(), "Skills dropdown is not displayed");

        LOG.info("Check Countries");
        Assert.assertTrue(registerPage.isCountriesdropdowndisplayed(), "Countries dropdown is not displayed");

        LOG.info("Check Selectcountry");
        Assert.assertTrue(registerPage.isSelectcountrydropdowndisplayed(), "Select country dropdown is not displayed");

        LOG.info("Check Year");
        Assert.assertTrue(registerPage.isYeardropdowndisplayed(), "Year dropdown is not displayed");

        LOG.info("Check Month");
        Assert.assertTrue(registerPage.isMonthdropdowndisplayed(), "Month dropdown is not displayed");

        LOG.info("Check Day");
        Assert.assertTrue(registerPage.isMonthdropdowndisplayed(), "Month dropdown is not displayed");

        LOG.info("Check Password");
        Assert.assertTrue(registerPage.isPasswordfieldisplayed(), "Password field is not displayed");

        LOG.info("Check Confirmpassword");
        Assert.assertTrue(registerPage.isConfirmpasswordfieldisplayed(), "Confirm password field is not displayed");

        LOG.info("Check Submit button");
        Assert.assertTrue(registerPage.isSubmitbuttondisplayed(), "Submit button is not displayed");

        LOG.info("Check Refresh button");
        Assert.assertTrue(registerPage.isRefreshbuttondisplayed(), "Refresh button is not displayed");


    }
}
