package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) { //constructor
		this.driver=driver; //para driver assigned to class driver
		//PageFactory.initElements(driver, this);
	}
	By username=By.id("userName");
	By password=By.id("password");
	By loginbtn=By.xpath("//button[text()='Login']");
	
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
		
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	public void clickLogin() {
		driver.findElement(loginbtn).click();
		
	}
	public void login(String uname,String pwd) {
		enterUsername(uname);
		enterPassword(pwd);
		clickLogin();
		
	}
	public boolean isLoginSuccessful() {
		 try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		        wait.until(ExpectedConditions.urlContains("profile"));
		        return true;
		    }
		    catch(Exception e) {
		        return false;
		    }
	}

	public String getErrorMessage() {

	    return driver.findElement(By.id("name")).getText();
	}
	By loginButton = By.id("login");

	public boolean isLoginPageDisplayed() {
	    return driver.findElement(loginButton).isDisplayed();
	}
}
