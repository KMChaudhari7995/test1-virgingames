package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Accept']")
    WebElement acceptCookie;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='Virgin Games']")
    WebElement logo;

    @CacheLookup
    @FindBy(linkText = "Online Slots")
    WebElement onlineSlots;

    @CacheLookup
    @FindBy(linkText = "Free Games")
    WebElement freeGames;

    @CacheLookup
    @FindBy(linkText = "Casino")
    WebElement casino;
    public void clickOnAcceptCookie() {
        clickOnElement(acceptCookie);
        log.info("Clicking on acceptCookie: " +acceptCookie.toString());
    }

    public boolean verifyLogoDisplayed(){
        log.info("Verify logo is displyed :"+logo);
       boolean isLogoisDisplayed = logo.isDisplayed();
       return  isLogoisDisplayed;
    }

    public void clickonOnlineSlots(){
        clickOnElement(onlineSlots);
        log.info("Clicking on Online Slots: "+onlineSlots);
    }

    public void clickOnFreeGames(){
        clickOnElement(freeGames);
        log.info("Clicking on Free games"+freeGames);
    }

    public void clickOnCasino(){
        clickOnElement(casino);
        log.info("Clicking on casino"+casino);
    }

}
