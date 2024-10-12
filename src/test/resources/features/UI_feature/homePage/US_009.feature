@UI @regression @US_009
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: User should be able to perform various operations on homepage
    When the relevant Register button should be clickable
    And the user clicks on the Register link
    Then the relevant Register page should be visible