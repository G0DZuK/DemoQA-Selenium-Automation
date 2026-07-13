package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TextBoxPage {

    WebDriver driver;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submitButton = By.id("submit");
    

    // Actions
    public void enterFullName(String name) {
        driver.findElement(fullName).sendKeys(name);
    }

    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    public void enterCurrentAddress(String address) {
        driver.findElement(currentAddress).sendKeys(address);
    }

    public void enterPermanentAddress(String address) {
        driver.findElement(permanentAddress).sendKeys(address);
    }

    public void clickSubmit() {
    	 WebElement submit = driver.findElement(By.id("submit"));

    	    ((JavascriptExecutor) driver)
    	            .executeScript("arguments[0].scrollIntoView({block:'center'});", submit);

    	    submit.click();
    }

    public void fillForm(String name, String mail,
                         String currentAddr,
                         String permanentAddr) {

        enterFullName(name);
        enterEmail(mail);
        enterCurrentAddress(currentAddr);
        enterPermanentAddress(permanentAddr);
        clickSubmit();
    }

    // Verification Methods

    public String getSubmittedName() {
        return driver.findElement(By.id("name")).getText();
    }

    public String getSubmittedEmail() {
        return driver.findElement(By.id("email")).getText();
    }
    public void printSubmittedData() {
        System.out.println(driver.findElement(By.id("name")).getText());
        System.out.println(driver.findElement(By.id("email")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@id='currentAddress']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText());
    }

}