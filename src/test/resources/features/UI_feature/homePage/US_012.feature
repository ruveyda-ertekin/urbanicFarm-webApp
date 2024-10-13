@UI @regression @US_012
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: Verify that "Backyard gardeners and farmers join the Movement For Free!" text visible and "Register now!" button at the bottom should be clickable
    When the user scrolls down the page until they see the text
    Then Backyard gardeners and farmers join the Movement For Free! text should be visible
    And Register now! button should be clickable