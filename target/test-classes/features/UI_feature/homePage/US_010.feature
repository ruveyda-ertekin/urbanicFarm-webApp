@UI @regression @US_010
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: Verify that the 'Get fresh produce' button is clickable and relevant page should be visible
    When the relevant Get fresh produce button should be clickable
    And the user clicks on the Get fresh produce link
    Then the relevant Farmers Market page should be visible