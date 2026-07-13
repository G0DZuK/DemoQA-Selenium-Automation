package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ModalDialogsPage;

public class ModalDialogsTest extends BaseTest{
	@Test
	public void verifyModalDialogs() {
		driver.get("https://demoqa.com/modal-dialogs");
		ModalDialogsPage modal=new ModalDialogsPage(driver);
		modal.clickSmallModal();
		System.out.println("Small Title : " + modal.getSmallTitle());
		System.out.println("Small Modal Body: "+modal.getModalBody());
		//System.out.println(modal.getModalBody());
		modal.clickCloseSmallModal();
		System.out.println("Small Modal Closed");
		
		modal.clickLargeModal();
		System.out.println("Large Title: " +modal.getLargeTitle());
		System.out.println("Large Modal Body :"+modal.getModalBody());
		//System.out.println(modal.getModalBody());
		modal.clickCloseLargeModal();
		System.out.println("Large Modal Closed");
	}

}
