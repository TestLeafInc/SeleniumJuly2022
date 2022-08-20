Feature: Login to the Leaftaps Application

Scenario: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the home page is displayed

Scenario: Negative Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa1'
When Click on the Login button
But Error message is displayed
