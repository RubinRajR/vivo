Feature: verify facebook login functionality.
Scenario: verify login functionality for valid username and invalid password

Given user is on facebook login page 
When user enters valid username and invalid password 
And user clicks the login button
Then error is displayed

