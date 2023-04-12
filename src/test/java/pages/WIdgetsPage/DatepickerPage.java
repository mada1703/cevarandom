package pages.WIdgetsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.time.Duration;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DatepickerPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(DatepickerPage.class);
    public static DatepickerPage instance;

    private DatepickerPage() {
    }

    public static DatepickerPage getinstance() {
        if (instance == null) {
            instance = new DatepickerPage();
        }
        return instance;
    }

    private By dateDisabled = By.xpath("//input[@id='datepicker1']");
    private By dateEnabled = By.xpath("//input[@id='datepicker2']");
    private By nextMonth = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
    private By day = By.xpath("//div[@id='ui-datepicker-div']//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']//a[@href='#']");

    String dateDay = "//div[@id='ui-datepicker-div']//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']//a[@href='%s']";


    public void clickDisabled(){
        LOG.info("Click the Date picker that is disabled");

        driver.findElement(dateDisabled).click();
    }

//    public void clickEnabled(){
//        LOG.info("Click the Date picker that is enabled");
//
//        //implicit wait - base page
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        //explicit wait - ala bun
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(dateEnabled));
//
//        //fluent wait
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(20))
//                .pollingEvery(Duration.ofMillis(600))
//                .ignoring(NoSuchElementException.class);
//        wait.until(driver -> driver.findElement(dateEnabled));
//
//        driver.findElement(dateEnabled).click();
//
//    }

    public String getCurrentDay(){
        LOG.info("Return the current day");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int todayint = calendar.get(Calendar.DAY_OF_MONTH);
        String todaystr=Integer.toString(todayint);
        return todaystr;
    }

    public void selectDay(String day){
        LOG.info("Select day");
        List<WebElement> columns = driver.findElements(By.tagName("td"));
        for (WebElement cell : columns) {
            String celltext = cell.getText();
            if (celltext.contains(day)) {
                cell.click();
                sleep(1000);
                break;
            }
        }
    }





//    public void clickNextMonth(){
//        LOG.info("Click the next month button");
//        driver.findElement(nextMonth).click();
//    }
//
//    public void selectDay(String day2){
//        LOG.info("Select day in may");
//        driver.findElement(day).click();
//        driver.findElement(By.xpath(String.format(dateDay, day))).click();
//    }


}
