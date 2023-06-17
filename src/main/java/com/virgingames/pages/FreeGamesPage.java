package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeGamesPage extends Utility {
    private static final Logger log = LogManager.getLogger(FreeGamesPage.class.getName());

    public FreeGamesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Experience a Selection of Free Games']")
    WebElement freeGAmesText;


    public String getTextFromFreeGames(){
        log.info("Get text From FreeGamesPage :"+freeGAmesText);
        return getTextFromElement(freeGAmesText);
    }


}
