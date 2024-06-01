Feature: Login functionality of Leaftaps application

Scenario: Login with positive credentials and verify
Given Launch the browser
And Load the url
And Enter the username as Demosalesmanager and password as crmsfa
When Click on the Login button
Then HomePage should be displayed

