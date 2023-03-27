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
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToAlertPage.class);

    @Test
    public void checkAlerts(){
        driver.get(newUrl);
    }

}
