
@SmokeTest
Feature: feature to test google search functionality
Scenario: Validate google search is working 
Given Browser is open 
And user is on google search page 
When user enters text in search box 
And Hit enter
Then user is navigate to search results
