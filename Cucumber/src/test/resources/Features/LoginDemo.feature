#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@SmokeTest
Feature: Login and navigate over homepage

  Scenario Outline: To verify the login functionality
    Given User is navigate over Login page
    When Enter correct <username> and <password>
    And Enter correct passowrd
    And Click on login button
    Then Navigate to homepage

    Examples: 
      | username|password |
      | 9039912946|rahul111 |
      | 96445455445|rahul66465|