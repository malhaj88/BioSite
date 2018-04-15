Meta:
@production
Scenario: TC-030 Verify the industry clockss link

Given I am On aipPublishingPage
When I click on aip_Industry_Clockss
And I switch tabs
Then page URL should be https://clockss.org/clockss/Home