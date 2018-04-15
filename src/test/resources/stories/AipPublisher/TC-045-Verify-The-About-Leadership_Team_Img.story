Meta:
@production
Scenario: TC-045 Verify The About Leadership Team images

Given I am On aipPublishingPage
When The aip_About should be About
And I hover over aip_About
And I click on aip_About_Leadership
Then The page_Title should be Executive Leadership Team
And The about_Page_Img should display