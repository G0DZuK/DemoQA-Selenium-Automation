package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.PracticeFormPage;

public class PracticeFormTest extends BaseTest{
	@Test
	public void verifyPracticeForm() {
		driver.get("https://demoqa.com/automation-practice-form");
		PracticeFormPage form=new PracticeFormPage(driver);
		
		form.enterFirstName("Jerry");
		form.enterLastName("S George");
		form.enterEmail("jerry@gmail.com");
		
		form.SelectGender();
		form.enterMobileNumber("9847242455");
		form.enterDoB();
		form.enterSubject("Maths");
		form.selectHobbies();
		form.uploadImage("C:\\Users\\jerry\\OneDrive\\Desktop\\ChatGPT Image Jun 30, 2026, 02_43_35 AM.png"); 
		form.enterAddress("Pathalil House, Karukachal");
		form.selectState("NCR");
		form.selectCity("Delhi");
		form.clickSubmit();
		form.printSubmittedDetails();
		//message
		String message=form.getSuccessMessage();
		System.out.println("Success Message: "+message);
		Assert.assertEquals(message, "Thanks for submitting the form");
	}

}
