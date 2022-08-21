Feature: Delete an existing lead in Leaftaps Application

Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the home page is displayed

Scenario Outline: Find and Delete Lead
Given Click CRMSFA Link
And Click Leads Tab
And Click Find Leads Link
And Type the first name in Find Leads Page as <firstName> 
And Click Find Leads Button
And Click First Matching Lead
And Click Delete Lead Link
And Click Find Leads Link
When Type the Lead Id in Find Leads Page 
And Click Find Leads Button
Then Verify Lead is deleted.
  
Examples:
|firstName|
|Babu|
|Hari|