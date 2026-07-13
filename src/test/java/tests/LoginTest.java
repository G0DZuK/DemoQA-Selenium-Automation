package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.DataProviders;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test(dataProvider="LoginData",
          dataProviderClass=DataProviders.class)

    public void loginTest(String username,
                          String password) {

        loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        Assert.assertTrue(
                loginPage.isLoginSuccessful(),
                "Login Failed for: " + username);
    }
}