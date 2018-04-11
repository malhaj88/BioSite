Meta:
@production
Scenario: TC-006 Verify The About Dropdwon
 
Given I am On aipPublishingPage
When The aip_About should be About
And I hover over aip_About
And I click on aip_About_Aboutpublisher
Then The page_Title should be About AIP Publishing
And I hover over aip_About
And I click on aip_About_Organization
And The page_Title should be Organization and Governance
And I hover over aip_About
And I click on aip_About_Board
And The page_Title should be Board of Managers
And I hover over aip_About
And I click on aip_About_Leadership
And The page_Title should be Executive Leadership Team
And I hover over aip_About
And I click on aip_About_Publishnews
And The page_Title should be AIP Publishing News