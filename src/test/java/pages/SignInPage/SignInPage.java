package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage(){}

    public static SignInPage getinstance(){
        if(instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private final By logo = By.id("logo");
    private final By signInButton=By.id("btn1");
    private final By skipSignInButton=By.id("btn2");
    private final By emailfield=By.id("email");
    private final By nextbutton=By.id("enterimg");

    public boolean isLogoDisplayed(){
        LOG.info("Verify if logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isSignInButtonDisplayed(){
        LOG.info("Verify if Sign In Button is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean skipSignInButtonDisplayed(){
        LOG.info("Verify if skip Sign In Button is displayed");
        return driver.findElement(skipSignInButton).isDisplayed();
    }

    public void clickSignInButton(){
        LOG.info("Click Sign In button");
        driver.findElement(signInButton).click();
    }

    public void clickSkipSignInButton(){
        LOG.info("Click skip Sign In button");
        driver.findElement(skipSignInButton).click();
    }

    public void clickemailfield(){
        LOG.info("Click email field");
        driver.findElement(emailfield).click();
    }

    public void typeinemailfield(String email){
        LOG.info("Type in email field");
        driver.findElement(emailfield).sendKeys(email);
    }

    public void clicknextbutton(){
        LOG.info("click next button");
        driver.findElement(nextbutton).click();
    }
}
