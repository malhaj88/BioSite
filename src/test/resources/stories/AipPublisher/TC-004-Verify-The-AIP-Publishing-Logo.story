Meta:
@production
Scenario: TC-004 Verify clicking on "Contact" link.
 
Given I am On aipPublishingPage
When page URL should be https://publishing.aip.org/
Then The aip_Publisher_Logo should display

