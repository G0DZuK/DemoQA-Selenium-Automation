package base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.ScreenshotUtil;

public class BaseTest {

    public static WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void initializeBrowser(String browser) {

        System.out.println("Browser = " + browser);

        if(browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } else if(browser.equalsIgnoreCase("edge")) {
        	System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");

            driver = new EdgeDriver();

        } else {

            throw new RuntimeException("Invalid Browser Name");
        }

        driver.get("https://demoqa.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void browserQuit(ITestResult result) {

    	 if (ITestResult.FAILURE == result.getStatus()) {

    	        ScreenshotUtil.captureScreenshot(driver, result.getName());
    	    }

    	    if (driver != null) {
    	        driver.quit();
    	    }
    }
}