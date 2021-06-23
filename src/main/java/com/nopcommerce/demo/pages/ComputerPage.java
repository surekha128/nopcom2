package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(partialLinkText = "Compute")
    WebElement computerlink;
    @FindBy(xpath ="//ul[@class='sublist']/li[1]/a")
    WebElement desktopLink;
    @FindBy(xpath = "//ul[@class='sublist']/li[2]/a")
    WebElement notebooksLink;
    @FindBy(xpath = "//ul[@class='sublist']/li[3]/a")
    WebElement softwareLink;
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement verifyTextForDesktopsPage;
    @FindBy(xpath = "//h1[contains(text(),'Notebooks')]")
    WebElement verifyTextFornotebookPage;
    @FindBy(xpath = " //h1[contains(text(),'Software')]")
    WebElement verifyTextForsoftwarePage;

    public void clickOnDesktopLink() {
        Reporter.log("Click on Desktop Link : " + desktopLink.toString() + "<br>");
        clickOnElement(computerlink);
        mouseHoverToElementAndClick(desktopLink);
        log.info("Click on Desktop Link : " + desktopLink.toString());
     //   String expectedMessage = "Desktops";
       // String actualMessage = getTextFromElement(verifyTextForsoftwarePage);
       // Assert.assertEquals(actualMessage, expectedMessage);
    }

    public void clickOnNotebookLink() {
        Reporter.log("Click on Software Link : " + notebooksLink.toString() + "<br>");
        mouseHoverToElementAndClick(notebooksLink);
        log.info("Click on Software Link : " + notebooksLink.toString());
       // String expectedMessage = "Notebooks";
      //  String actualMessage = getTextFromElement(verifyTextFornotebookPage);
    //    Assert.assertEquals(actualMessage, expectedMessage);

    }

    public void clickOnSoftwareLink() {
        Reporter.log("Click on Software Link : " + softwareLink.toString() + "<br>");
        mouseHoverToElementAndClick(softwareLink);
        log.info("Click on Software Link : " + softwareLink.toString());
     //   String expectedMessage = "Software";
     //   String actualMessage = getTextFromElement(verifyTextForsoftwarePage);
      //  Assert.assertEquals(actualMessage, expectedMessage);
    }





}
