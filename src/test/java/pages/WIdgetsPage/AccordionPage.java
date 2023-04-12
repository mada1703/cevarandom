package pages.WIdgetsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.List;

public class AccordionPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(AccordionPage.class);
    public static AccordionPage instance;

    private AccordionPage() {
    }

    public static AccordionPage getinstance() {
        if (instance == null) {
            instance = new AccordionPage();
        }
        return instance;
    }

    private By collapse1 = By.xpath("//b[normalize-space()='Collapsible Group 1 - Readability']");
    private By collapse2 = By.xpath("//b[normalize-space()='Collapsible Group 2 - Single Line Coding']");
    private By collapse3 = By.xpath("//b[normalize-space()='Collapsible Group 3 - Methhod Chaining']");
    private By collapse4 = By.xpath("//b[normalize-space()='Collapsible Group 4 - Cross Browser Testing']");
    private By allcollapse = By.xpath("//a[@data-toggle='collapse']");

    public void clickAllAccordion() {
        LOG.info("Click all accordion elements");
        List<WebElement> rows = driver.findElements(allcollapse);
        for (WebElement row : rows) {
            row.click();
        }
    }

    public void closeAllAccordions(String open) {
        LOG.info("Close all accordions");
        WebElement accordion = driver.findElement(allcollapse);
        List<WebElement> rows = accordion.findElements(allcollapse);
        for (WebElement row : rows) {
            String attributeValue = row.getAttribute("aria-expanded");
            if (attributeValue.equals(open)) {
                row.click();
            }
        }

    }

    public void openAllAccordions(String close) {
        LOG.info("Open all accordions");
        WebElement accordion = driver.findElement(allcollapse);
        List<WebElement> rows = accordion.findElements(allcollapse);
        for (WebElement row : rows) {
            String attributeValue = row.getAttribute("aria-expanded");
            if (attributeValue.equals(close)) {
                row.click();
            }
        }
    }
}

//    public void clicksecond() {
//        LOG.info("Click the second collapsable");
//        driver.findElement(collapse2).click();
//    }
//
//    public void clickthird(){
//        LOG.info("Click third collapsable");
//        driver.findElement(collapse3).click();
//    }
//
//    public void clickfourth(){
//        LOG.info("Click fourth collapsable");
//        driver.findElement(collapse4).click();
//    }
//
//    public void clickfirst(){
//        LOG.info("Click first collapsable");
//        driver.findElement(collapse1).click();
//    }





