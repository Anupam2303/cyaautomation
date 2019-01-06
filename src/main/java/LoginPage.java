import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

     WebElement useridtxt;
     WebElement accountdd;
     WebElement passwordtxt;
     WebElement loginBttn;

    public void sendUserIdTxt(String userid){
        System.out.println(driver);
        this.useridtxt = driver.findElement(By.id("usernameId"));
        useridtxt.sendKeys(userid);
    }
    public void sendpasswordTxt(String password){
        this.passwordtxt = driver.findElement(By.id("PasswordId"));
        passwordtxt.sendKeys(password);
    }
    public void selectAccountdd(String value){
        this.accountdd = driver.findElement(By.id("ddAccounts"));
        Select s = new Select(accountdd);
        s.selectByValue(value);
    }
    public void clickLoginBttn(){
        this.loginBttn = driver.findElement(By.id("loginsubmission"));
        Actions action = new Actions(driver);
        action.moveToElement(loginBttn).click().build().perform();
        loginBttn.click();
    }
}