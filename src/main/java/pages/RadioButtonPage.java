package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {

    WebDriver driver;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By yesRadio = By.xpath("//label[@for='yesRadio']");
    By impressiveRadio = By.xpath("//label[@for='impressiveRadio']");
    By noRadio = By.id("noRadio");

    // Result Message
    By resultMessage = By.className("mt-3");

    // Click Yes Radio Button
    public void clickYes() {
        driver.findElement(yesRadio).click();
    }

    // Click Impressive Radio Button
    public void clickImpressive() {
        driver.findElement(impressiveRadio).click();
    }

    // Verify No Radio Button is Disabled
    public boolean isNoDisabled() {
        return !driver.findElement(noRadio).isEnabled();
    }

    // Get Result Message
    public String getResultMessage() {
        return driver.findElement(resultMessage).getText();
    }

}