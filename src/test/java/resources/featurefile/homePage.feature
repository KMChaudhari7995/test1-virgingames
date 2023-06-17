
Feature: Homepage Functionality
  As a user, I want to verify Homepage Functionality
  @smoke
  Scenario: Verify company logo is displayed on the Homepage
    Given I am on HomePage
    When I click on accept cookies
    Then Verify the company logo is displayed

@smoke
  Scenario: Verify onlineSlots text is displayed on onlineSlotsPage
  Given I am on HomePage
  When I click on accept cookies
  And I click on OnlineSlots
  Then Verify the text Virgin Games Online Slots is displayed

  @sanity
  Scenario: Verify Experience a Selection of Free Games text is displayed on FreeGamesPage
  Given I am on HomePage
  When I click on accept cookies
  And I click on Free Games
  Then Verify the Experience a Selection of Free Games text is displayed

  @sanity
  Scenario: Verify Image is displayed on casino page
  Given I am on HomePage
  When I click on accept cookies
  And I click on Casino
  Then Verify image is displayed on Casino
