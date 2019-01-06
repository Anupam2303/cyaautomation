import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CyaLogin {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    private static final String BASEURL = "https://cya.coffee/BETAQA";

    @BeforeSuite
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "/Personal/Drivers/chromedriver");
    }

    @AfterTest
    private void tearDown(){
        driver.quit();
    }

    private void waitaBit(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void login(){
        driver.get(BASEURL);
        waitaBit();
        loginPage.sendUserIdTxt(""+Keys.TAB);
        waitaBit();
        loginPage.selectAccountdd("4");
        waitaBit();
        loginPage.sendpasswordTxt("");
        waitaBit();
        loginPage.clickLoginBttn();
    }

}
