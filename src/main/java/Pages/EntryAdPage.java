package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    WebDriver driver;

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    private By modalText = By.cssSelector("#modal > div.modal > div.modal-body > p");
    private By closeModalButton = By.cssSelector("#modal > div.modal > div.modal-footer > p");

    public String getmodalText() {
        String text = driver.findElement(modalText).getText();
        return text;
    }
    public void  ClickoncloseModalButton(){
        driver.findElement(closeModalButton).click();
    }
}
