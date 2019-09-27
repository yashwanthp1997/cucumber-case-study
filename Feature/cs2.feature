
Feature: Login using data table
  I want to use this template for my feature file
  
  Scenario Outline: Login
    Given user click on sign in
    When user enters username "<username>"
    And user enters "<password>"
    Then user click login button
    Examples: 
      | username|password|
      | AlexUser|Alex@123|
