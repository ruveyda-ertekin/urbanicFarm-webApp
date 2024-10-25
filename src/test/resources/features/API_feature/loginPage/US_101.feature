@API @US_101 @urbanicFarmBuyerLogin
Feature: Buyer Login API

  Scenario: User must be able to log in as candidate
    When the user sends POST request to login as a buyer
    Then the user asserts login response data