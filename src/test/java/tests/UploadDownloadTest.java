package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UploadDownloadPage;

public class UploadDownloadTest extends BaseTest {
	@Test
	public void verifyUploadDownload() {
		driver.get("https://demoqa.com/upload-download");
		UploadDownloadPage uploaddownload=new UploadDownloadPage(driver);
		uploaddownload.clickDownload();
		System.out.println("Clicked Download");
		Assert.assertTrue(uploaddownload.isFileDownloaded(
		        "C:\\Users\\jerry\\Downloads\\sampleFile.jpeg"));

		System.out.println("File Downloaded Successfully");
		uploaddownload.clickUpload(
				"C:\\Users\\jerry\\OneDrive\\Desktop\\ChatGPT Image Jun 30, 2026, 02_43_35 AM.png");

				System.out.println("File Uploaded");
				System.out.println(uploaddownload.printUploadPath());
		
	}
	

}
