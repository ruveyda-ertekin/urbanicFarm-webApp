@UI @regression @US_004
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: User should be able to perform various operations on homepage
    When the relevant Farmers Market button should be clickable
    And the user clicks on the Farmers Market link
    Then the relevant Farmers Market page should be visible