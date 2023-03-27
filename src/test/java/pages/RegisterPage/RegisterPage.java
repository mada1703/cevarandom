package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private By title = By.xpath("//div[h1='Automation Demo Site ']");
    private By title2 = By.xpath("//div[h2='Register ']");
    private By FirstName = By.xpath("//input[@placeholder='First Name']");
    private By inputFirstName = By.xpath("//input[@placeholder='First Name']");
    private By LastName = By.xpath("//input[@placeholder='Last Name']");
    private By inputLastName = By.xpath("//input[@placeholder='Last Name']");
    private By Address = By.xpath("//textarea[@ng-model='Adress']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By Email = By.xpath("//input[@ng-model='EmailAdress']");
    private By inputEmail = By.xpath("//input[@ng-model='EmailAdress']");
    private By Phone = By.xpath("//input[@ng-model='Phone']");
    private By inputPhone = By.xpath("//input[@ng-model='Phone']");
    private By Male = By.xpath("//input[@value = 'Male']");
    private By clickMale = By.xpath("//input[@value = 'Male']");
    private By Female = By.xpath("//input[@value = 'FeMale' ]");
    private By Cricket = By.id("checkbox1");
    private By Movies = By.id("checkbox2");
    private By Hockey = By.id("checkbox3");
    private By Languages = By.id("msdd");
    private By Skills = By.id("Skills");
    private By Countries = By.id("countries");
    private By Selectcountry = By.xpath("//span[@role='combobox' ]");
    private By inputCountry = By.xpath("//input[@role='textbox']");
    private By Year = By.id("yearbox");
    private By Month = By.xpath("//select[@placeholder ='Month' ]");
    private By Day = By.id("daybox");
    private By Password = By.id("firstpassword");
    private By Confirmpassword = By.id("secondpassword");
    private By Submit = By.id("submitbtn");
    private By Refresh = By.id("Button1");
    private By file = By.id("imagesrc");

    String selectLanguage = "//a[contains(text(), '%s')]";




    private RegisterPage() {

    }

    public static RegisterPage getinstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    //verificam daca exista titlu
    public boolean isTitleDisplayed() {
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }

//    public boolean isTitle2Displayed() {
//        LOG.info("Verify if title 2 is displayed");
//        return driver.findElement(title2).isDisplayed();
//    }

    public boolean isFirstNamefielddisplayed() {
        LOG.info("Verify if First Name field is displayed");
        return driver.findElement(FirstName).isDisplayed();
    }

    public void typeInFirstName(String firstName) {
        LOG.info("Type in First Name in 'First Name' field");
        driver.findElement(inputFirstName).sendKeys(firstName);

    }

    public void typeInLastName(String lastName) {
        LOG.info("Type in Last Name in 'Last Name' field");
        driver.findElement(inputLastName).sendKeys(lastName);

    }

    public boolean isLastNamefielddisplayed() {
        LOG.info("Verify if Last Name field is displayed");
        return driver.findElement(LastName).isDisplayed();
    }

    public boolean isAddressfielddisplayed() {
        LOG.info("Verify if Address field is displayed");
        return driver.findElement(Address).isDisplayed();
    }

    public void typeInAddress(String address) {
        LOG.info("Type in address in 'Address' field");
        driver.findElement(inputAddress).sendKeys(address);

    }

    public boolean isEmailfielddisplayed() {
        LOG.info("Verify if Email field is displayed");
        return driver.findElement(Email).isDisplayed();
    }

    public void typeInEmail(String email) {
        LOG.info("Type in email in 'Email' field");
        driver.findElement(inputEmail).sendKeys(email);

    }

    public boolean isPhonefielddisplayed() {
        LOG.info("Verify if Phone field is displayed");
        return driver.findElement(Phone).isDisplayed();
    }

    public void typeInPhone(String phone) {
        LOG.info("Type in phone number in 'Phone' field");
        driver.findElement(inputPhone).sendKeys(phone);

    }

    public boolean isMalecheckmarkdisplayed() {
        LOG.info("Verify if Male checkmark is displayed");
        return driver.findElement(Male).isDisplayed();
    }

    public void clickMalebutton() {
        LOG.info("click Male button");
        driver.findElement(clickMale).click();
    }

    public boolean isFemalecheckmarkdisplayed() {
        LOG.info("Verify if Female checkmark is displayed");
        return driver.findElement(Female).isDisplayed();

    }

    public boolean isCricketcheckmarkdisplayed() {
        LOG.info("Verify if Cricket checkmark is displayed");
        return driver.findElement(Cricket).isDisplayed();

    }

    public boolean isMoviescheckmarkdisplayed() {
        LOG.info("Verify if Movies checkmark is displayed");
        return driver.findElement(Movies).isDisplayed();

    }

    public boolean isHockeycheckmarkdisplayed() {
        LOG.info("Verify if Hockey checkmark is displayed");
        return driver.findElement(Hockey).isDisplayed();

    }

    public boolean isLanguagesdropdowndisplayed() {
        LOG.info("Verify if Languages dropdown is displayed");
        return driver.findElement(Languages).isDisplayed();

    }

    public void selectLanguage(String language) {
        LOG.info("Select language");
        driver.findElement(Languages).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click();
    }

    public boolean isSkillsdropdowndisplayed() {
        LOG.info("Verify if Skills dropdown is displayed");
        return driver.findElement(Skills).isDisplayed();

    }
//alegerea unei valori de la inspect skills select>option value
    public void selectSkills(String selectSkills) {
        LOG.info ("Select skills");
        Select newSkill = new Select (driver.findElement(Skills));
        newSkill.selectByValue(selectSkills);//select skills e acelasi cu cel scris de la linia 179
    }

    public boolean isCountriesdropdowndisplayed() {
        LOG.info("Verify if Countries dropdown is displayed");
        return driver.findElement(Countries).isDisplayed();

    }

    public boolean isSelectcountrydropdowndisplayed() {
        LOG.info("Verify if Select country dropdown is displayed");
        return driver.findElement(Selectcountry).isDisplayed();

    }

    public void selectCountry(String country) {
        LOG.info("Select country");
        driver.findElement(Selectcountry).click();
        driver.findElement(inputCountry).sendKeys(country);
        driver.findElement(inputCountry).sendKeys(Keys.ENTER);

    }

    public boolean isYeardropdowndisplayed() {
        LOG.info("Verify if Year dropdown is displayed");
        return driver.findElement(Year).isDisplayed();

    }

    public void setDateofBirth(String year, String month, String day){
        LOG.info("Select date of birth");
        Select newYear = new Select(driver.findElement(Year));
        newYear.selectByValue(year);
        Select newMonth = new Select(driver.findElement(Month));
        newMonth.selectByValue(month);
        Select newDay = new Select(driver.findElement(Day));
        newDay.selectByValue(day);
    }

    public boolean isMonthdropdowndisplayed() {
        LOG.info("Verify if Month dropdown is displayed");
        return driver.findElement(Month).isDisplayed();

    }

    public boolean isPasswordfieldisplayed() {
        LOG.info("Verify if Password field is displayed");
        return driver.findElement(Password).isDisplayed();

    }

    public void setPassword(String firstpassword){
        LOG.info("Set first password");
        driver.findElement(Password).sendKeys(firstpassword);
    }

    public boolean isConfirmpasswordfieldisplayed() {
        LOG.info("Verify if Confirm password field is displayed");
        return driver.findElement(Confirmpassword).isDisplayed();

    }

    public void setConfirmpassword(String secondpassword){
        LOG.info("Set second password");
        driver.findElement(Confirmpassword).sendKeys(secondpassword);
    }

    public boolean isSubmitbuttondisplayed() {
        LOG.info("Verify if Submit button is displayed");
        return driver.findElement(Submit).isDisplayed();

    }

    public boolean isRefreshbuttondisplayed() {
        LOG.info("Verify if Refresh button is displayed");
        return driver.findElement(Refresh).isDisplayed();

    }

    public void selectImage(){
        LOG.info("Choose image to upload");
        WebElement fileChoose = driver.findElement(file);
        fileChoose.sendKeys("C:/Users//mada1703//Desktop//javapic//Thinking-of-getting-a-cat.png");
    }

    public void clickSubmit(){
        LOG.info("Click submit button");
        driver.findElement(Submit).click();
    }




}
//keys.enter
//driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);