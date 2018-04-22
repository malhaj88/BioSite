Meta:
@production
Scenario: TC-029 Verify the industry Portico link

Given I am On aipPublishingPage
When I click on aip_Industry_Portico
And I switch tabs
Then page URL should be portico.org