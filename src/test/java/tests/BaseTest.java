package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;
import pages.SignInPage.SignInPage;
import pages.SwitchToPage.SwitchToAlertPage;

public class BaseTest {

    public SignInPage signInPage= SignInPage.getinstance();
    public RegisterPage registerPage= RegisterPage.getinstance();
    public SwitchToAlertPage switchToAlertPage=SwitchToAlertPage.getinstance()

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

//    @AfterSuite
//    public void tearDown(){
//        BasePage.tearDown();
//    }
}
