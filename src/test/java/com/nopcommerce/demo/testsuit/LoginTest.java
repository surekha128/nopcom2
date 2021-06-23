package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.apache.poi.ss.formula.functions.T;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;


    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "smoke"})
    public void verifyUserShouldNavigateToLoginPage() throws InterruptedException {
        loginPage.setClickloginlink();
        Thread.sleep(5000);
        loginPage.setEnteremail("abc12@yahoo.com");
        loginPage.setEnterpass("qwe123");
        loginPage.setClickrememberme();
        loginPage.setClickloginbtn();
        loginPage.setVerifyenvalidcredentials();
       // loginPage.setLoginsuccessfully();
    }
}
