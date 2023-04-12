package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.SwitchToPage.SwitchToAlertPage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SwitchToAlertTest extends BaseTest {
    private String newUrl = getBaseUrl() + "Alerts.html";
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToAlertTest.class);

    @Test
    public void checkAlerts() {
        driver.get(newUrl);

        String name = "Enache Madalin";

        LOG.info("Click alert box button");
        switchToAlertPage.clickalertWithOk();

        LOG.info("Click confirm box button and cancel");
        switchToAlertPage.clickconfirmboxbutton();

        LOG.info("Click prompt box, enter name and press ok");
        switchToAlertPage.clickpromptboxbutton(name);

    }


}
