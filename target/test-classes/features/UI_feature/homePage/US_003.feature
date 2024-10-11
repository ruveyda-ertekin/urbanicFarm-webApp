@UI @regression @US_003
Feature: Verify various operations on the home page

  @TC-01
  Scenario: User should be able to perform various operations on homepage

    Given the user is on the home page
    When the relevant Blog button should be clickable
    And the user clicks on the Blog link
    Then the relevant Blog page should be visible