Meta:
@production
Scenario: TC-026 Verify the industry chorusaccess link

Given I am On aipPublishingPage
When I click on aip_Industry_Chorusaccess
And I switch tabs
Then page URL should be https://www.chorusaccess.org/