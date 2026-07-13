package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BookDetailsPage;
import pages.BookStorePage;
import pages.LoginPage;
import pages.ProfilePage;

public class BookStoreFlowTest extends BaseTest {
	@Test
	public void verifyBookStoreFlow() {
		

	    driver.get("https://demoqa.com/login");

	    LoginPage loginPage = new LoginPage(driver);

	    loginPage.login("testuser1", "Test@123");

	    Assert.assertTrue(loginPage.isLoginSuccessful(), "Login Failed");

	    ProfilePage profile = new ProfilePage(driver);

	    Assert.assertEquals(profile.getUserName(), "testuser1");

	    System.out.println("Logged in User : " + profile.getUserName());
	    

	    profile.clickGoToBookStore();

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.urlContains("books"));

	    BookStorePage store = new BookStorePage(driver);

	    Assert.assertTrue(store.isBookStorePageDisplayed());

	    store.searchBook("Speaking JavaScript");

	    System.out.println("Book searched successfully.");

	    store.openSpeakingJavaScript();

	    System.out.println("Book opened successfully.");
	    
	    BookDetailsPage bookDetails = new BookDetailsPage(driver);

	    String actualTitle = bookDetails.getBookTitle();

	    Assert.assertEquals(actualTitle, "Speaking JavaScript");

	    System.out.println("Book Title : " + actualTitle);

	    bookDetails.clickAddToCollection();

	    bookDetails.clickBackToBookStore();

	    System.out.println("Returned to Book Store");
	    store.goToProfile();

	    System.out.println("Returned to Profile");

	    Assert.assertTrue(profile.isBookPresent());

	    System.out.println("Book found in Profile.");
	    profile.clickDeleteBook();

	    System.out.println("Delete icon clicked.");

	    profile.confirmDelete();

	    System.out.println("Delete confirmed.");

	    profile.acceptDeleteAlert();

	    System.out.println("Browser alert accepted.");

	    //Assert.assertFalse(profile.isThisBookPresent());

	   // System.out.println("Book deleted successfully.");
	    profile.clickLogout();
	    System.out.println("Clicked Logout");

	    Assert.assertTrue(loginPage.isLoginPageDisplayed());

	    System.out.println("Logout Successful");
	}
	

}
