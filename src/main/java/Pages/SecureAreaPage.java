package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
 public WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver=driver;
    }

private By validationtext = By.id("flash");
    public String getvalidationtext(){
        String text = driver.findElement(validationtext).getText();
        return text;
    }

}
