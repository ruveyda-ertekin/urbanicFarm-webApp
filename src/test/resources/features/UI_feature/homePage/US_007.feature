@UI @regression @US_007
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: User should be able to perform various operations on homepage
    When the relevant Contact Us button should be clickable
    And the user clicks on the Contact Us link
    Then the relevant Contact Us page should be visible