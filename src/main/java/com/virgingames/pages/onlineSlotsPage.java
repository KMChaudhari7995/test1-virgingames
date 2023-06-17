package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class onlineSlotsPage extends Utility {

    private static final Logger log = LogManager.getLogger(onlineSlotsPage.class.getName());

    public onlineSlotsPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Virgin Games Online Slots']")
    WebElement onlineSlotsText;

    public String getTextOnlineSlots(){
        log.info("Get text :"+onlineSlotsText);
        return (getTextFromElement(onlineSlotsText));
    }




}
