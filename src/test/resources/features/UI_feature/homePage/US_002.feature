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

  @TC-02
  Scenario: Verify that the Blog link is clickable and navigates to the Blog page
    When the relevant Blog button should be clickable
    And the user clicks on the Blog link
    Then the relevant Blog page should be visible

  @TC-03
  Scenario: Verify that the Farmers Market link is clickable and navigates to the Farmers Market page
    When the relevant Farmers Market button should be clickable
    And the user clicks on the Farmers Market link
    Then the relevant Farmers Market page should be visible

  @TC-04
  Scenario: Verify that the Explore link is clickable and navigates to the Explore page
    When the relevant Explore button should be clickable
    And the user clicks on the Explore link
    Then the relevant Explore page should be visible

  @TC-05
  Scenario: Verify that the About Us link is clickable and navigates to the About Us page
    When the relevant About Us button should be clickable
    And the user clicks on the About Us link
    Then the relevant About Us page should be visible

  @TC-07
  Scenario: Verify that the Contact Us link is clickable and navigates to the Contact Us page
    When the relevant Contact Us button should be clickable
    And the user clicks on the Contact Us link
    Then the relevant Contact Us page should be visible

  @TC-08
  Scenario: Verify that the Login link is clickable and navigates to the Login page
    When the relevant Login button should be clickable
    And the user clicks on the Login link
    Then the relevant Login page should be visible

  @TC-09
  Scenario: Verify that the Register link is clickable and navigates to the Register page
    When the relevant Register button should be clickable
    And the user clicks on the Register link
    Then the relevant Register page should be visible