package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadDownloadPage {
	WebDriver driver;
	public UploadDownloadPage(WebDriver driver) {
		this.driver=driver;
	}
	By downloadBtn=By.id("downloadButton");
	By uploadBtn=By.id("uploadFile");
	By uploadedPath=By.id("uploadedFilePath");
	
	//methods
	public void clickDownload() {
		driver.findElement(downloadBtn).click();
	}
	public void clickUpload(String path) {
		driver.findElement(uploadBtn).sendKeys(path);
	}
	public String printUploadPath() {
		 return driver.findElement(uploadedPath).getText();
	}
	public boolean isFileDownloaded(String filePath) {

	    File file = new File(filePath);

	    return file.exists();

	}
	

}
