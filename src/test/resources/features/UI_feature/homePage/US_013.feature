@UI @regression @US_013
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: Verify that SELL, SHARE, and TRADE buttons should be clickable in the Sell Your Products area
    When the user scrolls down the page until the "Sell Your Products" text is visible
    And the SELL button should be clickable
    And the SHARE button should be clickable
    And the TRADE button should be clickable