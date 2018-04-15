Meta:
@production
Scenario: TC-046 Verify The About Leadership Team Links

Given I am On aipPublishingPage
When The aip_About should be About
And I hover over aip_About
And I click on aip_About_Leadership
Then The page_Title should be Executive Leadership Team
And I click on about_Board_Managers_Organization_Link
And The page_Title should be Organization and Governance
And I click on about_Board_Managers_Link 
And The page_Title should be Board of Managers