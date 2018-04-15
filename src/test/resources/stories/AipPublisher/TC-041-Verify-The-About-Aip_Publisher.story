Meta:
@production
Scenario: TC-041 Verify The About aip publisher

Given I am On aipPublishingPage
When The aip_About should be About
And I hover over aip_About
And I click on aip_About_Aboutpublisher
Then The page_Title should be About AIP Publishing
And The about_Glopal_Reach should be Global Reach and Outstanding Quality
And The about_Fast_Publication should be Fast Publication Times
And The about_Number_Reviewers should be Number of Peer Reviewers in 2016
And I click on about_American_Institute
And page URL should be https://www.aip.org/