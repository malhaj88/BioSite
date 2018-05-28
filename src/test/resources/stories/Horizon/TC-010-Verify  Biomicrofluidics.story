Meta:
@production
Scenario: TC-010 Verify the Biointerphases links.

Given I am On horizonsPage
When I click on cookie
When I click on biomicro_Fluidics
And I switch tabs
Then page URL should be aip.scitation.org/journal/bmf
And The aip_Title should be Biomicrofluidics