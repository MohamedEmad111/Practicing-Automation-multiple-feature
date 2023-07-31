package Base;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BastTests {
    public WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        go_home();
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void go_home() {
        driver.get("https://the-internet.herokuapp.com/");
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
