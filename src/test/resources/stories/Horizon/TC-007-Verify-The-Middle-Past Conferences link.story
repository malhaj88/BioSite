Meta:
@production
Scenario: TC-007 Verify the images on home page.

Given I am On horizonsPage
When I Click On cookie
And I Click On cookie
And I scroll to 1000
When I click on past_Conferences
Then The interfaces_Energy_Materials should display
And The interfaces_Energy_Materials should display
And The 3d_Bioprinting should display
And The international_Conference should display