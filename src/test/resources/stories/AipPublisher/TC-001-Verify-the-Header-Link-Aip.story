Meta:
@production
Scenario: TC-001-Verify the Header Link AIP.
 
Given I am On aipPublishingPage
When I click on aippublish_Aip_Link
Then page URL should be https://www.aip.org/
And The aippublish_Aip_Link_More_About should be MORE ABOUT AIP