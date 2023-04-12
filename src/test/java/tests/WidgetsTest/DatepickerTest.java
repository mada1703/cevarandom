package tests.WidgetsTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.WIdgetsPage.DatepickerPage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class DatepickerTest extends BaseTest {

    private String newUrl = getBaseUrl() + "Datepicker.html";
    private static final Logger LOG = LoggerFactory.getLogger(DatepickerTest.class);

    @Test
    public void checkDatepicker() {
        driver.get(newUrl);

        String day = "5";


        LOG.info("Open date picker that is disabled");
        datepickerPage.clickDisabled();

        LOG.info("Current day");
        datepickerPage.selectDay(datepickerPage.getCurrentDay());

        LOG.info("Select day");
        datepickerPage.selectDay(day);

//        LOG.info("Open date picker that is enabled");
//        datepickerPage.clickEnabled();

        LOG.info("Current day for enabled");
        datepickerPage.selectDay(datepickerPage.getCurrentDay());

//        LOG.info("Open date picker that is enabled");
//        datepickerPage.clickEnabled();

        LOG.info("Select day");
        datepickerPage.selectDay(day);


//        LOG.info("Click the next month button");
//        datepickerPage.clickNextMonth();
//
//        LOG.info("Select a day");
//        datepickerPage.selectDay(day2);

    }
}