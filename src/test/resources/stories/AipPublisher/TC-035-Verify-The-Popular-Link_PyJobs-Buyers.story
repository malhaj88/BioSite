Meta:
@production
Scenario: TC-035 Verify the pobular physics buyer link 

Given I am On aipPublishingPage
When I click on aip_Footer_Popular_PYtodaybuyer_Link
And I switch tabs
Then page URL should be http://physicstodaybuyersguide.com/