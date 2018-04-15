Meta:
@production
Scenario: TC-042 Verify The About Board of Managers img

Given I am On aipPublishingPage
When The aip_About should be About
And I hover over aip_About
And I click on aip_About_Board
Then The page_Title should be Board of Managers
And The about_Page_Img should display