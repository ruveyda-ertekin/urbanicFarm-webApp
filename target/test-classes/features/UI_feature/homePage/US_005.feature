@UI @regression @US_005
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: User should be able to perform various operations on homepage
    When the relevant Explore button should be clickable
    And the user clicks on the Explore link
    Then the relevant Explore page should be visible