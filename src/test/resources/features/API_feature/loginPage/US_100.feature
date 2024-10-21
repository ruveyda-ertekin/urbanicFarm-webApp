@API @US_100
Feature: User Login API

  As a user, I should be able to log in through the Urbanic Farm API

  Background:
    Given the API base URL is set to "https://test.urbanicfarm.com/"

  Scenario: Successful login with valid credentials
    Given the user has a valid login payload
    When the user sends a POST request to the login endpoint
    Then the response status code should be 200
    And the user get PHPSESSID
    And the response should contain a token
    And the response should contain a email
    And the response should contain a first_name
    And the response should contain a first_lastname


