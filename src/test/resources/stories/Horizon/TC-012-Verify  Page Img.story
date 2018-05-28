Meta:
@production
Scenario: TC-012 Verify Horizon main page images.

Given I am On horizonsPage
When I click on cookie
When The horizonLogo should display
And The the_Middle_Img should display
