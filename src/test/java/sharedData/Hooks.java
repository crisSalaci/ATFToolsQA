package sharedData;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends BrowserService {
    @BeforeMethod
    public void prepareEnvironment(){
        initializeBrowser();
    }

    @AfterMethod
    public void clearEnvironment(){
        quitBrowser();
    }
}