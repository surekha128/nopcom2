package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(linkText = "Register")
    WebElement clickonregister;
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verfiyregisterpagetext;
    @FindBy(xpath = "//div[@id='gender']/span[1]")
    WebElement clickgendermale;
    @FindBy(xpath = "//div[@id='gender']/span[2]")
    WebElement getClickgenderfemale;
    @FindBy(css = "#FirstName")
    WebElement enterfirstname;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/span[2]")
    WebElement verifyfirstnamefieldnotempty;
    @FindBy(css = "#LastName")
    WebElement enterlatname;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement selectday;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement selectmonth;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement selectyear;
    @FindBy(css = "#Email")
    WebElement enteremailid;
    @FindBy(css = "#Company")
    WebElement entercompany;
    @FindBy(css = "#Password")
    WebElement enterpassword;
    @FindBy(css = "#ConfirmPassword")
    WebElement confirmpassword;
    @FindBy(css = "#register-button")
    WebElement clickregisterbtn;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifysuccessfulregistration;
    @FindBy(linkText = "Continue")
    WebElement clickoncountinue;

    public void setClickonregister(){
        Reporter.log("Click on rememberme : " + clickonregister.toString() + "<br>");
        clickOnElement(clickonregister);
        log.info("Click on rememberme : " + clickonregister.toString());
        String expectedMessage = "Register";
        String actualMessage = getTextFromElement(verfiyregisterpagetext);
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    public void setClickgender(String value){
        if (value == "M") {
            Reporter.log("Selection of HDD Attribute" + clickgendermale.toString() + "<br>");
            clickOnElement(clickgendermale);
        } else if (value == "F") {
            Reporter.log("Selection of HDD Attribute" + getClickgenderfemale.toString() + "<br>");
            clickOnElement(getClickgenderfemale);
        }
    }

    public void setEnterfirstname(String enterfirstnme) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(enterfirstname,enterfirstnme);
       // String expectedMessage = enterfirstnme;
     //   String actualMessage = getTextFromElement(verifyfirstnamefieldnotempty);
      //  Assert.assertEquals(expectedMessage,actualMessage);
    }

    public void setEnterlatname(String enterlastname) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(enterlatname,enterlastname);
    }

    public void setSelectday(String value){
        sendTextToElement(selectday,value);
    }

    public void setSelectmonth(String value){
        sendTextToElement(selectmonth,value);
    }

    public void setSelectyear(String value){
        sendTextToElement(selectyear,value);
    }

    public void setEnteremailid(String value){
        sendTextToElement(enteremailid,value);
    }

    public void setEntercompany(String value){
        sendTextToElement(entercompany,value);
    }

    public void setEnterpassword(String value){
        sendTextToElement(enterpassword,value);
    }

    public void setEnterconfirmpassword(String value){
        sendTextToElement(confirmpassword,value);
    }
    public void setClickregisterbtn(){
       clickOnElement(clickregisterbtn);
        String expectedMessage = "Your registration completed";
        String actualMessage = getTextFromElement(verifysuccessfulregistration);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
