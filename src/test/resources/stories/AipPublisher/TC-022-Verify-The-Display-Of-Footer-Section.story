Meta:
@production
Scenario: TC-022 Verify the display of footer section

Given I am On aipPublishingPage
When The aip_Footer_Img should display
Then The aip_Footer_Headquarter should be U.S. Headquarters
And The aip_Footer_Beijing should be Beijing office
And The aip_Footer_Popular_Link should be Popular Links:
And The aip_Footer_Popular_Pacs_Link should be Physics and Astronomy Classification Scheme
And The aip_Footer_Popular_PYtoday_Link should be Physics Today Jobs
And The aip_Footer_Popular_PYtodaybuyer_Link should be Physics Today Buyers Guide