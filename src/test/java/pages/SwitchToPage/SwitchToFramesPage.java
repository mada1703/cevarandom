package pages.SwitchToPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SwitchToFramesPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SwitchToFramesPage.class);
    public static SwitchToFramesPage instance;

    private SwitchToFramesPage() {
    }

    public static SwitchToFramesPage getinstance() {
        if (instance == null) {
            instance = new SwitchToFramesPage();
        }
        return instance;
    }

    private By singleIFrameButton = By.xpath("//a[@href='#Single']");
    private By multipleIFrameButton = By.xpath("//a[@href='#Multiple']");
    private By inputText = By.xpath("//input[@type='text']");
    private By singleIFrame = By.id("singleframe");
    private By multipleIFrame = By.xpath("//div[@id='Multiple']/iframe");

    public void clickSingleIFrame(String data) {
        LOG.info("Click single IFrame button");
        driver.findElement(singleIFrameButton).click();
        WebElement iFrame = driver.findElement(singleIFrame);
        driver.switchTo().frame(iFrame);
        driver.findElement(inputText).sendKeys(data);
        sleep(5000);
        driver.switchTo().defaultContent();
    }

    public void clickMultipleIFrame(String data2) {
        LOG.info("Click multiple IFrame button");
        driver.findElement(multipleIFrameButton).click();
        WebElement multIframe = driver.findElement(multipleIFrame);
        driver.switchTo().frame(multIframe);
        driver.switchTo().frame(0);
        driver.findElement(inputText).sendKeys(data2);
        sleep(5000);
        driver.switchTo().defaultContent();
    }


}
