package pages.WIdgetsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.List;

public class AutoCompletePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(AutoCompletePage.class);
    public static AutoCompletePage instance;

    private AutoCompletePage() {
    }

    public static AutoCompletePage getinstance() {
        if (instance == null) {
            instance = new AutoCompletePage();
        }
        return instance;
    }

    private By textfield = By.id("searchbox");

    public void enterText(String text) {
        LOG.info("Enter a text in the autocomplete field");
        driver.findElement(textfield).click();
    }

    public void selectAutoCompletedText(String text, String country) {
        LOG.info("Click the desired element from the autocomplete text");
        WebElement autocompleteField = driver.findElement(textfield);
        autocompleteField.sendKeys(text);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autocompleteSuggestions = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));

        List<WebElement> suggestions = autocompleteSuggestions.findElements(By.tagName("li"));

        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().equals(country)) {
                suggestion.click();
                break;
            }
        }
    }

}
