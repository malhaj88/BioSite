Meta:
@production
Scenario: TC-003 Verify clicking Home Link
 
Given I am On horizonsPage
When I hover over horizonHome
And I click on horizonHome
Then page URL should be https://horizons.aip.org/
And The horizonHomeTitle should be About AIP Publishing Horizons