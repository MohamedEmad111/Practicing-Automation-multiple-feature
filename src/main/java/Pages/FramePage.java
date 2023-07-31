package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    WebDriver driver;

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    private String frame = "mce_0_ifr";
    private By textField = By.id("tinymce");
    private By AlignRightButton=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[4]/button[3]");


    public void SwitchToFrame() {
        driver.switchTo().frame(frame);
    }

    public void SwitchToParent() {
        driver.switchTo().parentFrame();
    }

    public void clearText() {
        SwitchToFrame();
        driver.findElement(textField).clear();
        SwitchToParent();
    }

    public void insertText(String textfiledform) {
        SwitchToFrame();
        driver.findElement(textField).sendKeys(textfiledform);
        SwitchToParent();
    }
    public void ClickonAlignRightButton(){
        driver.findElement(AlignRightButton).click();
    }
}
