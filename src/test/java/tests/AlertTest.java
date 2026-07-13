package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertPage;


public class AlertTest extends BaseTest {

    @Test(priority = 1)
    public void verifySimpleAlert() {
        driver.get("https://demoqa.com/alerts");
        AlertPage alert = new AlertPage(driver);
        alert.clickSimpleAlert();
        String text = alert.getAlertText();
        System.out.println("Simple Alert : " + text);

        Assert.assertEquals(text, "You clicked a button");

        alert.acceptAlert();
        System.out.println("Simple Alert Accepted");
    }

    @Test(priority = 2)
    public void verifyTimerAlert() {
        driver.get("https://demoqa.com/alerts");
        AlertPage alert = new AlertPage(driver);
        alert.clickTimerAlert();
        String text = alert.getAlertText();
        System.out.println("Timer Alert : " + text);

        Assert.assertEquals(text, "This alert appeared after 5 seconds");

        alert.acceptAlert();

        System.out.println("Timer Alert Accepted");
    }

    @Test(priority = 3)
    public void verifyConfirmAlertAccept() {

        driver.get("https://demoqa.com/alerts");

        AlertPage alert = new AlertPage(driver);

        alert.clickConfirmAlert();

        System.out.println(alert.getAlertText());

        alert.acceptAlert();

        System.out.println(alert.getConfirmResult());

        Assert.assertEquals(alert.getConfirmResult(), "You selected Ok");
    }

    @Test(priority = 4)
    public void verifyConfirmAlertDismiss() {

        driver.get("https://demoqa.com/alerts");

        AlertPage alert = new AlertPage(driver);

        alert.clickConfirmAlert();

        System.out.println(alert.getAlertText());

        alert.dismissAlert();

        System.out.println(alert.getConfirmResult());

        Assert.assertEquals(alert.getConfirmResult(), "You selected Cancel");
    }

    @Test(priority = 5)
    public void verifyPromptAlert() {

        driver.get("https://demoqa.com/alerts");

        AlertPage alert = new AlertPage(driver);

        alert.clickPromptAlert();

        System.out.println(alert.getAlertText());

        alert.enterPromptText("Jerry");

        System.out.println(alert.getPromptResult());

        Assert.assertEquals(alert.getPromptResult(), "You entered Jerry");
    }

}