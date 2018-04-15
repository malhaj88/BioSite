Meta:
@production
Scenario: TC-027 Verify the industry Crossref link

Given I am On aipPublishingPage
When I click on aip_Industry_Chorusaccess
And I switch tabs
Then page URL should be https://www.crossref.org/