@UI @regression @US_015
Feature: Verify clickable buttons under the "Reduce waste, strengthen your community" heading

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: Verify that the "What's Near You" buttons should be clickable under the "Reduce waste, strengthen your community" heading
    When the user scrolls down the page until the Reduce waste, strengthen your community heading is visible
    And What's Near You button should be clickable
    Then the relevant What's Near You page should open

  @TC-02
  Scenario: Verify that the "Post Your Goods" buttons should be clickable under the "Reduce waste, strengthen your community" heading
    When the user scrolls down the page until the Reduce waste, strengthen your community heading is visible
    And Post Your Goods button should be clickable
    Then the relevant Post Your Goods page should open
