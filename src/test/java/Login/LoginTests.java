package Login;

import Base.BastTests;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;



import static org.testng.Assert.assertTrue;

public class LoginTests extends BastTests {
    @Test(priority = 1)
    public void successfullogin() {
        LoginPage loginPage =homePage.ClickonformAuthenticationLink();
        loginPage.enterUsername("tomsmith");
        loginPage.enterpassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =  loginPage.clickonLoginButton();
        String actual_result=secureAreaPage.getvalidationtext();
        System.out.println(secureAreaPage.getvalidationtext());
        String expected_result="You logged into a secure area!";
        assertTrue(actual_result.contains(expected_result));

    }
    @Test(priority = 2)
    public void invalidusername(){
        LoginPage loginPage =homePage.ClickonformAuthenticationLink();
        loginPage.enterUsername("9999999");
        loginPage.enterpassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =  loginPage.clickonLoginButton();
        String actual_result=secureAreaPage.getvalidationtext();
        System.out.println(secureAreaPage.getvalidationtext());
        String expected_result="Your username is invalid!";
        assertTrue(actual_result.contains(expected_result));
    }
    @Test(priority = 3)
    public void invalidpassword(){
        LoginPage loginPage =homePage.ClickonformAuthenticationLink();
        loginPage.enterUsername("tomsmith");
        loginPage.enterpassword("9999999999!");
        SecureAreaPage secureAreaPage =  loginPage.clickonLoginButton();
        String actual_result=secureAreaPage.getvalidationtext();
        System.out.println(secureAreaPage.getvalidationtext());
        String expected_result="Your password is invalid!";
        assertTrue(actual_result.contains(expected_result));
    }

}

