package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablePage {

    WebDriver driver;
    WebDriverWait wait;

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By addButton = By.id("addNewRecordButton");
    By submitButton = By.id("submit");

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");
    By age = By.id("age");
    By salary = By.id("salary");
    By department = By.id("department");

    By searchBox = By.id("searchBox");

    public void clickAddButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
    }

    public void addEmployee(String fname, String lname,
                            String mail, String empAge,
                            String empSalary, String dept) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(age).sendKeys(empAge);
        driver.findElement(salary).sendKeys(empSalary);
        driver.findElement(department).sendKeys(dept);

        driver.findElement(submitButton).click();
    }

    public void searchEmployee(String name) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).clear();
        driver.findElement(searchBox).sendKeys(name);
    }

    public boolean isEmployeeFound(String name) {

        return wait.until(ExpectedConditions.textToBePresentInElementValue(searchBox, name));
    }

}