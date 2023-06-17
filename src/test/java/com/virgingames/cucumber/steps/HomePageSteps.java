package com.virgingames.cucumber.steps;

import com.virgingames.pages.Casino;
import com.virgingames.pages.FreeGamesPage;
import com.virgingames.pages.HomePage;
import com.virgingames.pages.onlineSlotsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {

    }

    @When("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
    new HomePage().clickOnAcceptCookie();
    }

    @Then("^Verify the company logo is displayed$")
    public void verifyTheCompanyLogoIsDisplayed() {
        Assert.assertTrue(new HomePage().verifyLogoDisplayed());
    }

    @And("^I click on OnlineSlots$")
    public void iClickOnOnlineSlots() {
        new HomePage().clickonOnlineSlots();
    }

    @Then("^Verify the text Virgin Games Online Slots is displayed$")
    public void verifyTheTextVirginGamesOnlineSlotsIsDisplayed() {
        String expectedMessage = "Virgin Games Online Slots";
        String actualMessage = new onlineSlotsPage().getTextOnlineSlots();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @And("^I click on Free Games$")
    public void iClickOnFreeGames() {
        new HomePage().clickOnFreeGames();
    }

    @Then("^Verify the Experience a Selection of Free Games text is displayed$")
    public void verifyTheExperienceASelectionOfFreeGamesTextIsDisplayed() {
        String expectedMessage = "Experience a Selection of Free Games";
        String actualMessage = new FreeGamesPage().getTextFromFreeGames();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @And("^I click on Casino$")
    public void iClickOnCasino() throws Exception{
        new HomePage().clickOnCasino();
        Thread.sleep(2000);
    }

    @Then("^Verify image is displayed on Casino$")
    public void verifyImageIsDisplayedOnCasino() {
        Assert.assertTrue(new Casino().getImage());
    }

}
