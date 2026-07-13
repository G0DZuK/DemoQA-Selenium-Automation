package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.RadioButtonPage;

public class RadioButtonTest extends BaseTest {

    RadioButtonPage radioPage;

    @Test(priority = 1)
    public void verifyYesRadioButton() {

        driver.get("https://demoqa.com/radio-button");

        radioPage = new RadioButtonPage(driver);

        radioPage.clickYes();

        String actualMessage = radioPage.getResultMessage();

        System.out.println("Message : " + actualMessage);

        Assert.assertEquals(actualMessage, "You have selected Yes");
    }

    @Test(priority = 2)
    public void verifyImpressiveRadioButton() {

        driver.get("https://demoqa.com/radio-button");

        radioPage = new RadioButtonPage(driver);

        radioPage.clickImpressive();

        String actualMessage = radioPage.getResultMessage();

        System.out.println("Message : " + actualMessage);

        Assert.assertEquals(actualMessage, "You have selected Impressive");
    }

    @Test(priority = 3)
    public void verifyNoRadioButtonDisabled() {

        driver.get("https://demoqa.com/radio-button");

        radioPage = new RadioButtonPage(driver);

        Assert.assertTrue(radioPage.isNoDisabled());

        System.out.println("No Radio Button is Disabled");
    }

}