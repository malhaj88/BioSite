Meta:
@production
Scenario: TC-010 Verify the Biointerphases links.

Given I am On horizonsPage
When I click on apl_Bio_Link
And I switch tabs
Then page URL should be https://aip.scitation.org
And The aip_Title should be Biomicrofluidics