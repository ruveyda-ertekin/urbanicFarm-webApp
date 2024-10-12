@UI @regression @US_011
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: Verify that the 'Sell Your Products' text is visible
    When the user scrolls down the page
    Then the Sell Your Products text should be visible
