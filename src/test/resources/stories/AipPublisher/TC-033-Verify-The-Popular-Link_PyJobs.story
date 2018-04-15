Meta:
@production
Scenario: TC-033 Verify the pobular physics job link 

Given I am On aipPublishingPage
When I click on aip_Footer_Popular_PYtoday_Link
And I switch tabs
Then page URL should be https://jobs.physicstoday.org/