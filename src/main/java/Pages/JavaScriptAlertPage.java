package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {
    WebDriver driver;
    public JavaScriptAlertPage(WebDriver driver) {
        this.driver=driver;
    }
    private By JsAlertButton=By.cssSelector("#content > div > ul > li:nth-child(1) > button");
    private By confirmAlert=By.cssSelector("#content > div > ul > li:nth-child(2) > button");
    private By promptAlert=By.cssSelector("#content > div > ul > li:nth-child(3) > button");

    public void clickonJsAlertButton(){
        driver.findElement(JsAlertButton).click();
    }
    public void clickonConfirmAlert(){
        driver.findElement(confirmAlert).click();
    }
    public String getconfirmalertText(){
        String text =driver.switchTo().alert().getText();
        return text;
    }
    public void clickonPromptAlert(){
        driver.findElement(promptAlert).click();
    }
    public void sendkeysPromptAlerts(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void acceptAlert()
    {
driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String gettextAlert(){
       String text= driver.switchTo().alert().getText();
       return text;
    }

}

