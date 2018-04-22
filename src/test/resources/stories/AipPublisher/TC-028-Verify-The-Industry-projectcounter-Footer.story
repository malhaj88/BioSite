Meta:
@production
Scenario: TC-028 Verify the industry projectcounter link

Given I am On aipPublishingPage
When I click on aip_Industry_Projectcounter
And I switch tabs
Then page URL should be https://www.projectcounter.org/