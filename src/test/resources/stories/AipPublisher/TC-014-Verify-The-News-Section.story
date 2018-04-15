Meta:
@production
Scenario: TC-014-Verify The AIP Journals in the News

Given I am On aipPublishingPage
When The aip_News_Slider should be AIP Journals in the News
Then The aip_News_Slider_Image should display
And User clicks on aip_News_Slider_Link, and page_Title and it opens proberly