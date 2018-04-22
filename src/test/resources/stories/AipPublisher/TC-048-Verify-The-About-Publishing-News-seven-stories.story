Meta:
@production
Scenario: TC-048 Verify The About Publishing news

Given I am On aipPublishingPage
When The aip_About should be About
And I hover over aip_About
And I click on aip_About_Publishnews
Then The page_Title should be AIP Publishing News
And The about_Publishing_News_Press_Releases should be Press Releases
And The press_Releases_one should display
And The press_Releases_Two should display
And The press_Releases_Three should display
And The press_Releases_Four should display
And The press_Releases_Five should display
And The press_Releases_Six should display
And The press_Releases_Seven should display