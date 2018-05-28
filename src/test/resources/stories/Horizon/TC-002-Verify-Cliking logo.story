Meta:
@production
Scenario: TC-002- Verify clicking the logo img.
 
Given I am On horizonsPage
When I Click On cookie
And I Click On cookie
When I hover over horizonLogo
And I click on horizonLogo
Then page URL should be horizons.aip.org/
And The horizonHomeTitle should be About AIP Publishing Horizons