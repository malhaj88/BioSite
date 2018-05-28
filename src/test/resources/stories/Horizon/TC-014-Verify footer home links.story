Meta:
@production
Scenario: TC-014 Verify Horizon footer links.

Given I am On horizonsPage
When I click on cookie
When I click on  horizon_Footer_Home
Then The horizonHomeTitle should display
And I click on horizon_Footer_Upcoming_Conferences
And The horizonUpcomingTitle should display
And I click on horizon_Footer_Past_Conferences
And The horizonPastTitle should display
And I click on horizon_Footer_Privacy_Policy
And The horizonPastTitle should display
And I click on horizon_Footer_Contact