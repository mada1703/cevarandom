package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getinstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    //aici se introduc locatori (tot timpul in tabul de page) si se introduce actiunea
//prima pagina
    private final By logo = By.id("logo");
    private final By signInButton = By.id("btn1");
    private final By skipSignInButton = By.id("btn2");
    private final By emailfield = By.id("email");
    private final By nextbutton = By.id("enterimg");

    //Sign in page(a doua pagina)
    private By signInEmailField = By.xpath("//input[@type='text']");
    private By signInPasswordField = By.xpath("//input[@type='password']");
    private By enterButton = By.id("enterbtn");
    private By errorMsg = By.id("errormsg");

    public boolean isLogoDisplayed() {
        LOG.info("Verify if logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if Sign In Button is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean skipSignInButtonDisplayed() {
        LOG.info("Verify if skip Sign In Button is displayed");
        return driver.findElement(skipSignInButton).isDisplayed();
    }

    public void clickSignInButton() {
        LOG.info("Click Sign In button");
        driver.findElement(signInButton).click();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click skip Sign In button");
        driver.findElement(skipSignInButton).click();
    }

    public void clickemailfield() {
        LOG.info("Click email field");
        driver.findElement(emailfield).click();
    }

    public void typeinemailfield(String email) {
        LOG.info("Type in email field");
        driver.findElement(emailfield).sendKeys(email);
    }

    public void clicknextbutton() {
        LOG.info("click next button");
        driver.findElement(nextbutton).click();
    }

    public void typeInSignInEmailfield(String email) {
        LOG.info("Typing email adress in 'Email' field");
        driver.findElement(signInEmailField).sendKeys(email);
    }

    public void typeInSignInPasswordfield(String password) {
        LOG.info("Typing password in 'Paswword' field");
        driver.findElement(signInPasswordField).sendKeys(password);
    }

    public void clickenterButton(){
        LOG.info("click 'enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed(){
        LOG.info("Veryfing if error message is displayed");
        return driver.findElement(errorMsg).isDisplayed();
    }

    public void clickBack(){
        LOG.info("Clicking back in browser");
        driver.navigate().back();

    }



}
