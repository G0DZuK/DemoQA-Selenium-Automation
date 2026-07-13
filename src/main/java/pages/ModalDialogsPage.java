package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalDialogsPage {
	WebDriver driver;
	public ModalDialogsPage(WebDriver driver) {
		this.driver=driver;
	}
	//locators
	
	By smallModalBtn=By.id("showSmallModal");
	By largeModalBtn=By.id("showLargeModal");
	
	By smallTitle=By.id("example-modal-sizes-title-sm");
	By largeTitle=By.id("example-modal-sizes-title-lg");
	
	By modalBody=By.className("modal-body");
	
	By smallCloseBtn=By.id("closeSmallModal");
	By largeCloseBtn=By.id("closeLargeModal");
	
	//methods
	public void clickSmallModal() {
		driver.findElement(smallModalBtn).click();
	}
	public void clickLargeModal() {
		driver.findElement(largeModalBtn).click();
	}
	public void clickCloseSmallModal() {
		driver.findElement(smallCloseBtn).click();
	}
	public void clickCloseLargeModal() {
		driver.findElement(largeCloseBtn).click();
	}
	public String getSmallTitle() {
		return driver.findElement(smallTitle).getText();
	}
	public String getLargeTitle() {
		return driver.findElement(largeTitle).getText();
	}
	public String getModalBody() {
		return driver.findElement(modalBody).getText();
	}

}
