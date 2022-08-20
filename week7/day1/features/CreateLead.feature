Feature: Create a new lead in Leaftaps Application

Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the home page is displayed

Scenario Outline: Create Lead with different data
Given Click CRMSFA Link
And Click Leads Tab
And Click Create Leads Link
When Type the company name as <companyName>
And Type the first name as <firstName>
And Type the last name as <lastName>
And Click Create Leads Button
Then Verify the View Leads Page
  
Examples:
|companyName|firstName|lastName|
|TestLeaf|Babu|Manickam|
|Qeagle|Hari|R|