package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By simpleAlert = By.id("alertButton");
    By timerAlert = By.id("timerAlertButton");
    By confirmAlert = By.id("confirmButton");
    By promptAlert = By.id("promtButton");

    By confirmResult = By.id("confirmResult");
    By promptResult = By.id("promptResult");

    // simple alert

    public void clickSimpleAlert() {
        driver.findElement(simpleAlert).click();
    }

    //timer alert

    public void clickTimerAlert() {
        driver.findElement(timerAlert).click();
    }

    // -confirmation alert

    public void clickConfirmAlert() {
        driver.findElement(confirmAlert).click();
    }

    // prompt alert

    public void clickPromptAlert() {
        driver.findElement(promptAlert).click();
    }

    // methods of alert

    public String getAlertText() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        return alert.getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {

        driver.switchTo().alert().dismiss();
    }

    public void enterPromptText(String text) {

        Alert alert = driver.switchTo().alert();

        alert.sendKeys(text);
        alert.accept();
    }

    // result

    public String getConfirmResult() {
        return driver.findElement(confirmResult).getText();
    }

    public String getPromptResult() {
        return driver.findElement(promptResult).getText();
    }

}