package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By JavaScriptAlertsLink = By.linkText("JavaScript Alerts");
    private By EntryAd_Link = By.linkText("Entry Ad");
    private By frameLink=By.linkText("WYSIWYG Editor");


    public LoginPage ClickonformAuthenticationLink() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public JavaScriptAlertPage ClickonJavaScriptAlerts(){
        driver.findElement(JavaScriptAlertsLink).click();
        return new JavaScriptAlertPage(driver);
    }
    public EntryAdPage clickonEntryAd(){
        driver.findElement(EntryAd_Link).click();
        return new EntryAdPage(driver);
    }
    public FramePage clickonFrameLink(){
        driver.findElement(frameLink).click();
    return new FramePage(driver);
}}


