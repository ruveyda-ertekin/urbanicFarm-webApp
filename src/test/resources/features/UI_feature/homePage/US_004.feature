@UI @regression @US_004
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: Verify that the Farmers Market link is clickable and navigates to the Farmers Market page
    When the relevant Farmers Market button should be clickable
    And the user clicks on the Farmers Market link
    Then the relevant Farmers Market page should be visible