package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FramesPage;

public class FramesTest extends BaseTest{
	@Test
	public void verifyFrames() {
		driver.get("https://demoqa.com/frames");
		FramesPage frames=new FramesPage(driver);
		frames.switchToFrame1();
		String text1=frames.getHeading();
		System.out.println("Frame 1:"+text1);
		
		frames.switchToMainPage();
		System.out.println("Returned to Main Page");
		
		frames.switchToFrame2();
		String text2=frames.getHeading();
		System.out.println("Frame2: "+text2);
		
		frames.switchToMainPage();
		System.out.println("Returned back to Main Page");
		
	}

}
