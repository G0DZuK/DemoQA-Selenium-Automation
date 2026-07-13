package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BookStorePage {

    WebDriver driver;

    public BookStorePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By searchBox = By.id("searchBox");
    By book = By.linkText("Speaking JavaScript");
    By profileBtn = By.xpath("//span[text()='Profile']");

    public boolean isBookStorePageDisplayed() {
        return driver.findElement(searchBox).isDisplayed();
    }

    public void searchBook(String bookName) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));

        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(bookName);
    }

    public void openSpeakingJavaScript() {
    	 driver.findElement(book).click();
    }

    public boolean isBookDisplayed() {
        return driver.findElement(book).isDisplayed();
    }
    public void goToProfile() {

        WebElement profile = driver.findElement(profileBtn);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", profile);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", profile);

        System.out.println("Clicked Profile");
    }
}