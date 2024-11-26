package pages;

import modelRequest.RequestAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProfilePage extends BasePage{
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    private By userNameLocater=By.id("userName-value");
    @FindBy(id = "userName-value")
    private WebElement userNameTextElement;

    public void validateLoginProcess(RequestAccount requestBody){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameLocater));

        String actualUserName=userNameTextElement.getText();
        Assert.assertEquals(actualUserName,requestBody.getUserName(),"The username is not login with success");
    }
}