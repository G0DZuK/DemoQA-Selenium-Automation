package pages;

import java.util.List;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PracticeFormPage {
	WebDriver driver;
	public PracticeFormPage(WebDriver driver) {
		this.driver=driver;
	}
	//locators
	By firstName=By.xpath("//input[@id='firstName']");
	By lastName=By.xpath("//input[@id='lastName']");
	By email=By.xpath("//input[@id='userEmail']");
	
	By gender = By.xpath("//label[@for='gender-radio-1']");
	
	By mobileNumber=By.xpath("//input[@id='userNumber']");
	
	By dateOfBirth=By.xpath("//input[@id='dateOfBirthInput']");
	
	By subjects=By.id("subjectsInput");
	
	By hobbies = By.xpath("//label[@for='hobbies-checkbox-1']");
	
	By uploadImage=By.id("uploadPicture");
	
	By address=By.id("currentAddress");
	
	By state = By.id("react-select-3-input");
	
	By city = By.id("react-select-4-input");
	
	//Submit
	By submit=By.id("submit");
	
	
	
	//Success
	By successMessage=By.id("example-modal-sizes-title-lg");
	
	public void enterFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}
	public void enterLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}
	public void enterEmail(String emailId) {
		driver.findElement(email).sendKeys(emailId);
	}
	public void SelectGender() {
		driver.findElement(gender).click();
	}
	public void enterMobileNumber(String mobile) {
		driver.findElement(mobileNumber).sendKeys(mobile);
	}
	public void enterDoB() {
		 driver.findElement(dateOfBirth).click();

		    Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		    year.selectByVisibleText("2001");

		    Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		    month.selectByVisibleText("August");

		    driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='9']")).click();
	}
	public void enterSubject(String subject) {
		driver.findElement(subjects).sendKeys(subject);

	    driver.findElement(subjects).sendKeys(Keys.ENTER);

	    driver.findElement(subjects).sendKeys(Keys.TAB);
	}
	public void selectHobbies() {
		driver.findElement(hobbies).click();
	}
	public void uploadImage(String imagePath) {
		driver.findElement(uploadImage).sendKeys(imagePath);
	}
	public void enterAddress(String addr) {
		driver.findElement(address).sendKeys(addr);
	}
	public void selectState(String stateName) {
	    driver.findElement(state).sendKeys(stateName);
	    driver.findElement(state).sendKeys(Keys.ENTER);
	}

	public void selectCity(String cityName) {
	    driver.findElement(city).sendKeys(cityName);
	    driver.findElement(city).sendKeys(Keys.ENTER);
	}
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
	public String getSuccessMessage() {
		return driver.findElement(successMessage).getText();
	}
	public void printSubmittedDetails() {

		 List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

		    System.out.println("===== Submitted Details =====");

		    for (WebElement row : rows) {

		        String field = row.findElement(By.xpath("./td[1]")).getText();
		        String value = row.findElement(By.xpath("./td[2]")).getText();

		        System.out.println(field + " : " + value);
		    }

	}
	
	

}
