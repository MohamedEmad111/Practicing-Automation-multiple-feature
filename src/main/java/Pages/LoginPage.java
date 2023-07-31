package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
 public WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    private By username = By.id("username");
    private By password = By.id("password");
    private By LoginButton = By.className("radius");


    public void enterUsername(String textUsserName){
        driver.findElement(username).sendKeys(textUsserName);
    }
    public void enterpassword(String textPassword){
        driver.findElement(password).sendKeys(textPassword);
    }
    public SecureAreaPage clickonLoginButton(){
        driver.findElement(LoginButton).click();
        return new SecureAreaPage(driver);
    }
}


