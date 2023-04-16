Feature: Login

Scenario: Successful Login with valid Credentials
Given User Launch Chrome browser
When User opens URL "https://demo.actitime.com/"
And User enters Username as "admin" and password as "manager"
And  Click on login 
Then page title should be "actiTIME - Enter Time-Track"
When User click on log out link
And close Browser




