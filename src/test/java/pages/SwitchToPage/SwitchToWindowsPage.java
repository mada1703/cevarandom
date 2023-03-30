package pages.SwitchToPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SwitchToWindowsPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SwitchToWindowsPage.class);
    public static SwitchToWindowsPage instance;

    private SwitchToWindowsPage() {
    }

    public static SwitchToWindowsPage getinstance() {
        if (instance == null) {
            instance = new SwitchToWindowsPage();
        }
        return instance;
    }

    private By openwindow = By.xpath("//a[normalize-space()='Open New Tabbed Windows']");
    private By clicknewtab = By.xpath("//a[@href='http://www.selenium.dev']");
    private By clickSeparateWindows = By.xpath("//a[@href='#Seperate']");
    private By clickSeparateWindowsButton = By.xpath("//button[@class='btn btn-primary']");
    private By clickMultipleWindows = By.xpath("//a[@href='#Multiple']");
    private By clickMultipleWindowsButton = By.xpath("//button[@onclick='multiwindow()']");


    public void openWindowButton(){
        LOG.info("Click open new tab button");
        driver.findElement(openwindow).click();
        driver.findElement(clicknewtab).click();
    }

    public void openSeparateWindows(){
        LOG.info("Click open separate windows button");
        driver.findElement(clickSeparateWindows).click();
        driver.findElement(clickSeparateWindowsButton).click();
    }

    public void openMultipleWindows(){
        LOG.info("Click open separate windows button");
        driver.findElement(clickMultipleWindows).click();
        driver.findElement(clickMultipleWindowsButton).click();
    }

    public void switchToNewTabWindow(){
        LOG.info("Switch to new tab windows");
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()){
            if (!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }


}
