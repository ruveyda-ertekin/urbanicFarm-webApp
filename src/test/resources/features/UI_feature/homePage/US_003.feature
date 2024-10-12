@UI @regression @US_003
Feature: Verify that the Blog link is clickable and navigates to the Blog page

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: Verify that the Blog link is clickable and navigates to the Blog page
    When the relevant Blog button should be clickable
    And the user clicks on the Blog link
    Then the relevant Blog page should be visible