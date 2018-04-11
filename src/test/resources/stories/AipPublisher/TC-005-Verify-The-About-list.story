Meta:
@production
Scenario: TC-005 Verify The About list 
 
Given I am On aipPublishingPage
When I hover over aip_About
Then The aip_About_Aboutpublisher should be About AIP Publishing
And The aip_About_Organization should be Organization & Governance
And The aip_About_Board should be Board of Managers
And The aip_About_Leadership should be Leadership Team
And The aip_About_Publishnews should be AIP Publishing News
