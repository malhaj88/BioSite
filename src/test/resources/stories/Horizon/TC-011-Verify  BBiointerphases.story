Meta:
@production
Scenario: TC-011 Verify the bioInterPhases links.

Given I am On horizonsPage
When I click on apl_Bio_Link
And I switch tabs
Then page URL should be https://avs.scitation.org/journal/bip
And The avs_Title should be Biointerphases