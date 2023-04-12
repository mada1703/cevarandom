package tests.WidgetsTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class AccordionTest extends BaseTest {

    private String newUrl = getBaseUrl() + "Accordion.html";
    private static final Logger LOG = LoggerFactory.getLogger(AccordionTest.class);

    @Test
    public void checkAccordion() {
        driver.get(newUrl);

        String open="true";
        String close = "false";

        LOG.info("Click all accordion");
        accordionPage.clickAllAccordion();

        LOG.info("All accordion will be closed");
        accordionPage.closeAllAccordions(open);
        LOG.info("All accordion will be open");
        accordionPage.openAllAccordions(close);

//        LOG.info("Click the second collapsable");
//        accordionPage.clicksecond();
//
//        LOG.info("Click the third collapsable");
//        accordionPage.clickthird();
//
//        LOG.info("Click the fourth collapsable");
//        accordionPage.clickfourth();
//
//        LOG.info("Collapse all");
//        accordionPage.clickfourth();
//        accordionPage.clickthird();
//        accordionPage.clicksecond();
//        accordionPage.clickfirst();



    }
}
