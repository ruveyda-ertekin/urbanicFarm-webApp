@UI @regression @US_008
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: User should be able to perform various operations on homepage
    When the relevant Login button should be clickable
    And the user clicks on the Login link
    Then the relevant Login page should be visible