@UI @regression @US_006
Feature: Verify various operations on the home page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: User should be able to perform various operations on homepage
    When the relevant About Us button should be clickable
    And the user clicks on the About Us link
    Then the relevant About Us page should be visible