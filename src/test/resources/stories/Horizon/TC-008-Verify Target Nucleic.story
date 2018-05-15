Meta:
@production
Scenario: TC-008 Verify the footer links.

Given I am On horizonsPage
When I click on targeted_Nucleic_Acid
And I switch tabs
Then page URL should be horizons.aip.org/appliedbiosciences/
And The horizonLogo should display