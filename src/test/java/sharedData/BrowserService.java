package sharedData;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Getter
public class BrowserService {
    private WebDriver driver;

    public void initializeBrowser(){
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
    }

    public void quitBrowser()
    {
        driver.quit();
    }
}