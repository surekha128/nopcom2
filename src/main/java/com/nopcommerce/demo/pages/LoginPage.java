package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(linkText = "Log in")
    WebElement clickloginlink;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement Verifylogintext;
    @FindBy(css = "#Email")
    WebElement enteremail;
    @FindBy(css = "#Password")
    WebElement enterpass;
    @FindBy(css = "#RememberMe")
    WebElement clickrememberme;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement clickloginbtn;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement verifyenvalidcredentials;
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement getVerifylogintext;


    public void setClickloginlink(){
        Reporter.log("Click on login Link : " + clickloginlink.toString() + "<br>");
        clickOnElement(clickloginlink);
        log.info("Click on login Link : " + clickloginlink.toString());
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromElement(Verifylogintext);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void setEnteremail(String value){
        Reporter.log("send text : " + enteremail.toString() + "<br>");
        sendTextToElement(enteremail,value);
        log.info("send text : " + enteremail.toString());
    }

    public void setEnterpass(String value){
        Reporter.log("send text : " + enterpass.toString() + "<br>");
        sendTextToElement(enterpass,value);
        log.info("send text : " + enterpass.toString());
    }

    public void setClickrememberme(){
        Reporter.log("Click on rememberme : " + clickrememberme.toString() + "<br>");
        clickOnElement(clickrememberme);
        log.info("Click on rememberme : " + clickrememberme.toString());
    }

    public void setClickloginbtn(){
        Reporter.log("Click on loginbutton : " + clickloginbtn.toString() + "<br>");
        clickOnElement(clickloginbtn);
        log.info("Click on loginbutton : " + clickloginbtn.toString());

    }

    public void setVerifyenvalidcredentials(){
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = getTextFromElement(verifyenvalidcredentials);
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    public void setLoginsuccessfully(){
        String expectedMessage = "Welcome to our store";
        String actualMessage = getTextFromElement(getVerifylogintext);
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
