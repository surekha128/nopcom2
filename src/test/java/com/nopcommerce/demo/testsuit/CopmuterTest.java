package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CopmuterTest extends TestBase {
    ComputerPage computerPage;

    @BeforeMethod
    public void setUp(){
        computerPage = new ComputerPage();
    }
@Test(groups = {"sanity"})
    public void verifynaviagatetodesktop() throws InterruptedException {
        computerPage.clickOnDesktopLink();
        computerPage.clickOnNotebookLink();
        computerPage.clickOnSoftwareLink();
    }
}
