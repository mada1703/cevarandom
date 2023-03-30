package pages.SwitchToPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SwitchToAlertPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SwitchToAlertPage.class);
    public static SwitchToAlertPage instance;

    private SwitchToAlertPage() {
    }

    public static SwitchToAlertPage getinstance() {
        if (instance == null) {
            instance = new SwitchToAlertPage();
        }
        return instance;
    }

    private By alertWithOk = By.xpath("//a[@href='#OKTab']");
    private By alertboxbutton = By.xpath("//button[@class='btn btn-danger']");
    private By alertokandcancel = By.xpath("//a[normalize-space()='Alert with OK & Cancel']");
    private By confirmboxbutton = By.xpath("//button[@class='btn btn-primary']");
    private By alertwithtext = By.xpath("//a[normalize-space()='Alert with Textbox']");
    private By promptboxbutton = By.xpath("//button[@class='btn btn-info']");


    public void clickalertWithOk() {
        LOG.info("Click Alert with ok tab");
        driver.findElement(alertWithOk).click();
        driver.findElement(alertboxbutton).click();
        driver.switchTo().alert().accept();//sa faca switch la minipag de alerta si apasa ok (accept)
    }

    public void clickconfirmboxbutton(){
        LOG.info("Click confirm box and press cancel");
        driver.findElement(alertokandcancel).click();
        driver.findElement(confirmboxbutton).click();
        driver.switchTo().alert().dismiss();
    }

    public void clickpromptboxbutton(String name){
        LOG.info("Click prompt box, enter name and press ok");
        driver.findElement(alertwithtext).click();
        driver.findElement(promptboxbutton).click();
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();
    }
}
