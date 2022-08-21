Feature: Edit an existing lead in Leaftaps Application


Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the home page is displayed

@smoke
Scenario Outline: Find and Edit Lead with different data
Given Click CRMSFA Link
And Click Leads Tab
And Click Find Leads Link
And Type the first name in Find Leads Page as <firstName> 
And Click Find Leads Button
And Click First Matching Lead
And Click Edit Lead Link
When Change the existing company name <companyName>
And Click Update Button
Then Verify company name contains as <companyName>
  
Examples:
|firstName|companyName|
|Babu|Qeagle|
|Hari|TestLeaf|