Meta:
@production
Scenario: TC-009 Verify the footer  ABOUT AIP PUBLISHING link.

Given I am On advertisingPage
When I click on adv_Footer_About_Aip
And I switch to window
Then page URL should be https://publishing.aip.org/
And The adv_Aip_Logo should display
