package tests.WidgetsTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class AutoCompleteTest extends BaseTest {
    private String newUrl = getBaseUrl() + "AutoComplete.html";
    private static final Logger LOG = LoggerFactory.getLogger(AutoCompleteTest.class);

    @Test
    public void checkAutocomplete() {
        driver.get(newUrl);

        String text = "Ro";
        String country = "Romania";

        LOG.info("Enter text in the autocomplete text field");
        autoCompletePage.enterText(text);

        LOG.info("Select the autocomplete option");
        autoCompletePage.selectAutoCompletedText(text, country);

    }
}