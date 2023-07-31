package Alerts;

import Base.BastTests;
import Pages.JavaScriptAlertPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AlertsTests extends BastTests {
    @Test(priority = 1)
    public void acceptAlert(){
      JavaScriptAlertPage javaScriptAlertPage = homePage.ClickonJavaScriptAlerts();
      javaScriptAlertPage.clickonJsAlertButton();
        String actual_result=javaScriptAlertPage.gettextAlert();
        String expedted_result="I am a JS Alert";
        assertTrue(actual_result.contains(expedted_result));
        javaScriptAlertPage.acceptAlert();

    }
    @Test(priority = 2)
    public void confirmAler(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.ClickonJavaScriptAlerts();
        javaScriptAlertPage.clickonConfirmAlert();
        String actual_result= javaScriptAlertPage.getconfirmalertText();
        String expected_result="I am a JS Confirm";
        assertTrue(actual_result.contains(expected_result));
        javaScriptAlertPage.acceptAlert();
    }
    @Test(priority = 3)
    public void promptAlert(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.ClickonJavaScriptAlerts();
        javaScriptAlertPage.clickonPromptAlert();
        javaScriptAlertPage.sendkeysPromptAlerts("mohamemd emad");
        javaScriptAlertPage.acceptAlert();
    }

}
