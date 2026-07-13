package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTest {

    TextBoxPage textBoxPage;

    @Test

    public void verifyTextBoxSubmission() {

        driver.get("https://demoqa.com/text-box");

        textBoxPage = new TextBoxPage(driver);

        textBoxPage.fillForm(
                "Jerry S George",
                "jerry@gmail.com",
                "Kochi, Kerala",
                "Ernakulam, Kerala");

        Assert.assertTrue(
                textBoxPage.getSubmittedName().contains("Jerry S George"));

        Assert.assertTrue(
                textBoxPage.getSubmittedEmail().contains("jerry@gmail.com"));
        textBoxPage.printSubmittedData();

    }

}