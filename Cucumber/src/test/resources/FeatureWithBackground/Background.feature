Feature: feature to test google search functionality

Background: user is logged in
When user enters username and password
And clicks on login button
Then user is navigated

Scenario: Validate google search is working 
Given user in login page  
And user is on google search page 
When user enters text in search box 
And Hit enter
Then user is navigate to search results


Scenario: Validate login is working 
Given user in login page 
When user enters valid username and password 
Then user is logged in and navigate on Home page