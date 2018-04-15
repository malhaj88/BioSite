Meta:
@production
Scenario: TC-049 Verify SEE ALL PRESS RELEASES link

Given I am On aipPublishingPage
When The aip_About should be About
And I hover over aip_About
And I click on aip_About_Publishnews
Then The page_Title should be AIP Publishing News
And The about_Publishing_News_Press_Releases should be Press Releases
And I click on press_See_All_Press_Link
And The press_Releases_Eight should display