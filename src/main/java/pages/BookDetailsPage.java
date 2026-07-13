package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookDetailsPage {

    WebDriver driver;

    public BookDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By bookTitle = By.xpath("//label[text()='Speaking JavaScript']");
    By addToCollection = By.xpath("//button[text()='Add To Your Collection']");
    By backToBookStoreBtn = By.xpath("//button[text()='Back To Book Store']");

    public String getBookTitle() {
    	return driver.findElement(bookTitle).getText();
    }

    public void clickAddToCollection() {

        WebElement button = driver.findElement(addToCollection);

        ((JavascriptExecutor)driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", button);

        ((JavascriptExecutor)driver)
                .executeScript("arguments[0].click();", button);

        System.out.println("Clicked Add To Collection");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println("Alert Text : " + alert.getText());

        alert.accept();

        System.out.println("Alert Accepted");
    }

    public void clickBackToBookStore() {
        driver.findElement(backToBookStoreBtn).click();
    }
}