Meta:
@production
Scenario: TC-031 Verify the industry copyright link

Given I am On aipPublishingPage
When I click on aip_Industry_Copyright
And I switch tabs
Then page URL should be http://www.copyright.com/