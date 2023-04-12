package tests;

import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;
import pages.SignInPage.SignInPage;
import pages.SwitchToPage.SwitchToAlertPage;
import pages.SwitchToPage.SwitchToFramesPage;
import pages.SwitchToPage.SwitchToWindowsPage;
import pages.WIdgetsPage.AccordionPage;
import pages.WIdgetsPage.AutoCompletePage;
import pages.WIdgetsPage.DatepickerPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getinstance();
    public RegisterPage registerPage = RegisterPage.getinstance();
    public SwitchToAlertPage switchToAlertPage = SwitchToAlertPage.getinstance();
    public SwitchToWindowsPage switchToWindowsPage = SwitchToWindowsPage.getinstance();
    public SwitchToFramesPage switchToFramesPage = SwitchToFramesPage.getinstance();
    public AccordionPage accordionPage = AccordionPage.getinstance();
    public DatepickerPage datepickerPage = DatepickerPage.getinstance();
    public AutoCompletePage autoCompletePage = AutoCompletePage.getinstance();

    @BeforeSuite
    public void init(){

        BasePage.setUp();
    }

//    @AfterSuite
//    public void tearDown(){
//        BasePage.tearDown();
//    }
}
