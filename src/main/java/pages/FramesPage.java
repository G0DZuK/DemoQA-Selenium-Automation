package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
	WebDriver driver;
	public FramesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//locators
	By frame1=By.id("frame1");
	By frame2=By.id("frame2");
	By heading=By.id("sampleHeading");
	
	
	public void switchToFrame1() {
		driver.switchTo().frame(driver.findElement(frame1));
	}
	public String getHeading() {
		return driver.findElement(heading).getText();
	}
	public void switchToMainPage() {
		driver.switchTo().defaultContent();
	}
	public void switchToFrame2() {
		driver.switchTo().frame(driver.findElement(frame2));
	}
	

}
