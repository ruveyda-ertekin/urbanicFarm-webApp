@UI @regression @US_008
Feature: Verify various operations on the home page and login page visibility

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: Verify that the Login link is clickable and navigates to the Login page
    When the relevant Login button should be clickable
    And the user clicks on the Login link
    Then the relevant Login page should be visible