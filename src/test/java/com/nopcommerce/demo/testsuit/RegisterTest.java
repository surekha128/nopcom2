package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

        RegisterPage registerPage;

        @BeforeMethod
        public void setUp(){

            registerPage = new RegisterPage();
        }

        @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldRegisterWithValidCredentials() throws InterruptedException {
            registerPage.setClickonregister();
            registerPage.setClickgender("M");//M or F
            registerPage.setEnterfirstname("ktistal");
            registerPage.setEnterlatname("dizz");
            registerPage.setSelectday("08");
            registerPage.setSelectmonth("12");
            registerPage.setSelectyear("1982");
            registerPage.setEnteremailid("camma2@dznf.net");
            registerPage.setEntercompany("heartlow");
            registerPage.setEnterpassword("qwer123@");
            registerPage.setEnterconfirmpassword("qwer123@");


        }
}
