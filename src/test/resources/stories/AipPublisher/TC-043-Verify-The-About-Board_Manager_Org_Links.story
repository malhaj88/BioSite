Meta:
@production
Scenario: TC-043 Verify The About Board of Managers Organization link

Given I am On aipPublishingPage
When The aip_About should be About
And I hover over aip_About
And I click on aip_About_Board
Then The page_Title should be Board of Managers
And I click on about_Board_Managers_Organization_Link
And The page_Title should be Organization and Governance