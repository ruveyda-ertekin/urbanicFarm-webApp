@UI @regression @US_002
Feature: Verify that the home page header buttons

  Background:
    Given the user is on the home page

  @TC-01
  Scenario: As a user I should be able to see the various titles when I enter the homepage

    Then the following headers should be visible from left to right:
      | Support the local food movement |
      | Blog                            |
      | Farmers Market                  |
      | Explore                         |
      | About Us                        |
      | Contact Us                      |
      | Login                           |
      | Register                        |