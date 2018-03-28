Meta:
@production
Scenario: TC-003-Verify the Header Link China.
 
Given I am On aipPublishingPage
When I click on aippublish_China_Link
Then page URL should be https://china.aip.org/china
And The aippublish_China_Logo should display