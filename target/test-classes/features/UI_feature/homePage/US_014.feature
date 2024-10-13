@UI @regression @US_014
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: Verify that the "Contribution to the Environment and Society" heading under the "Register Now" section should be clickable
    When the user scrolls down the page until the Contribution to the Environment and Society text is visible
    And the Register Now button should be clickable
