@smoke
Feature: F06_select_different_Categories |  Logged user could select different Categories

  Scenario: user could login with valid email and password
    Given user go to login page
    When user login with valid email and password
    And user press on login button
    Then user login to the system successfully

  Scenario: user could select different Categories
    Given  Logged user in home page
    When user detierment to Categories and Hover to sub_Categories
    Then Click on sub categories successfully
