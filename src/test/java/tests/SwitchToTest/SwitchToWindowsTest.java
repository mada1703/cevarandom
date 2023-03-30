package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class SwitchToWindowsTest extends BaseTest {
    private String newUrl = getBaseUrl() + "Windows.html";
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToWindowsTest.class);


    @Test
    public void checkWindows() {
        driver.get(newUrl);

        LOG.info("Open windows button");
        switchToWindowsPage.openWindowButton();
        switchToWindowsPage.switchToNewTabWindow();

        LOG.info("Open separate windows button");
        switchToWindowsPage.openSeparateWindows();
        switchToWindowsPage.switchToNewTabWindow();

        LOG.info("Open multiple windows button");
        switchToWindowsPage.openMultipleWindows();
        switchToWindowsPage.switchToNewTabWindow();


    }


}