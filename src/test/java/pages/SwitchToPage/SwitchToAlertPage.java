package pages.SwitchToPage;

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
}
