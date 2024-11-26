package pages;

import modelRequest.RequestAccount;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    private WebElement usernameElement;
    @FindBy(id = "password")
    private WebElement passwordElement;
    @FindBy(id = "login")
    private WebElement loginElement;

    public void loginProcess(RequestAccount requestBody){

        usernameElement.sendKeys(requestBody.getUserName());
        passwordElement.sendKeys(requestBody.getPassword());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        loginElement.click();
    }
}