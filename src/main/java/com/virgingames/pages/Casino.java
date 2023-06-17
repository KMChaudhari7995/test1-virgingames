package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casino extends Utility {

    private static final Logger log = LogManager.getLogger(Casino.class.getName());

    public Casino(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//img[@alt='9 Up Blackjack']")
    WebElement casinoImage;


    public boolean getImage(){
        log.info("Image"+casinoImage);
        return verifyThatElementIsDisplayed(casinoImage);
    }
}
