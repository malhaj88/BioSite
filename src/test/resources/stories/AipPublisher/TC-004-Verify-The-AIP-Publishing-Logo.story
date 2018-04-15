Meta:
@production
Scenario: TC-004 Verify The Aip Logo
 
Given I am On aipPublishingPage
When page URL should be https://publishing.aip.org/
Then The aip_Publisher_Logo should display

