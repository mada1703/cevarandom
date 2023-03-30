package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SwitchToFramesTest extends BaseTest {

    private String newUrl = getBaseUrl() + "Frames.html";
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToFramesTest.class);

    @Test
    public void checkFrames() {
        driver.get(newUrl);

        String data = "Enache Madalin";
        String data2 = "Madalin Enache";

        LOG.info("Insert single iframes data");
        switchToFramesPage.clickSingleIFrame(data);

        LOG.info("Insert multiple iframes data");
        switchToFramesPage.clickMultipleIFrame(data2);
    }


}
