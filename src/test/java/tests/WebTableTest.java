package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.WebTablePage;

public class WebTableTest extends BaseTest {

    @Test
    public void verifyAddEmployee() {

        driver.get("https://demoqa.com/webtables");

        WebTablePage table = new WebTablePage(driver);

        table.clickAddButton();

        table.addEmployee(
                "Jerry",
                "S George",
                "jerry@gmail.com",
                "24",
                "50000",
                "QA");

        table.searchEmployee("Jerry");

        Assert.assertTrue(table.isEmployeeFound("Jerry"));

        System.out.println("Employee searched successfully.");

    }
}