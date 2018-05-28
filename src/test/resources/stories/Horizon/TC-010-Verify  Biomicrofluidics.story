Meta:
@production
Scenario: TC-010 Verify the Biointerphases links.

Given I am On horizonsPage
When I Click On cookie
And I Click On cookie
And I scroll to 500
When I click on biomicro_Fluidics
And I switch tabs
Then page URL should be aip.scitation.org/journal/bmf
And The aip_Title should be Biomicrofluidics