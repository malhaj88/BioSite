Meta:
@production
Scenario: TC-011 Verify the bioInterPhases links.

Given I am On horizonsPage
When I click on bioInterPhases
And I switch tabs
Then page URL should be https://avs.scitation.org/journal/bip
And The aip_Title should be Biointerphases