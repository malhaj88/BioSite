Meta:
@production
Scenario: TC-009 Verify the Biomicrofluidics  links.

Given I am On horizonsPage
When I Click On cookie
And I Click On cookie
And I scroll to 500
When I click on apl_Bio_Link
And I switch tabs
Then page URL should be aip.scitation.org
And The aip_Title should be APL Bioengineering