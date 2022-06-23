#Author Mitesh Rakholiya
#Date 22-06-2022

Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
  	Given Browser is open
    Given User is on login page
    When User enters username and passoword
    Then click on compose button

    