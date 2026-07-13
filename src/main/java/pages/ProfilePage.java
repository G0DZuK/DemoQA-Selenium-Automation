package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

    WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By userName = By.id("userName-value");
    By goToBookStore = By.id("gotoStore");
    By speakingJavaScript = By.linkText("Speaking JavaScript");
    By deleteBook = By.id("delete-record-9781449365035");
    By popupOk = By.id("closeSmallModal-ok");
    By logoutBtn=By.id("submit");

    // Methods
    public String getUserName() {
        return driver.findElement(userName).getText();
    }

    public void clickGoToBookStore() {
    	 WebElement button = driver.findElement(goToBookStore);
    	 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

    	    System.out.println("Clicked Go To Book Store");
    	
    }
    public boolean isBookPresent() {
        return driver.findElement(speakingJavaScript).isDisplayed();
    }
    public void clickDeleteBook() {
    	driver.findElement(deleteBook).click();
    }
    public void confirmDelete() {
    	driver.findElement(popupOk).click();
    }
    public void acceptDeleteAlert() {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	Alert alert=wait.until(ExpectedConditions.alertIsPresent());
    	System.out.println(alert.getText());
    	alert.accept();
    }
    public boolean isThisBookPresent() {

        return driver.findElements(By.linkText("Speaking JavaScript")).size() > 0;
    }
    public void clickLogout() {
        driver.findElement(logoutBtn).click();
        
        driver.getCurrentUrl();
    }
}