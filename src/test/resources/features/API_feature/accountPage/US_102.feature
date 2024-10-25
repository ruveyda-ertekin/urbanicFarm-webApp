@API @regression @US_102 @urbanicFarmBuyerLogin
Feature: Get Seller Rates

  As a user,
  I want to be able to get rates of the seller
  So that I can assess the seller's performance.

  Background:
    When the user sends POST request to login as a buyer
    Then the user asserts login response data

  Scenario: Successfully get rates of the seller
    When the user sends a POST request to the getRates endpoint
    Then the response status code should be 200
    And the response should contain the seller rates