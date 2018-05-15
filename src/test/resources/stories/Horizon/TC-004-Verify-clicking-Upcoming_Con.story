Meta:
@production
Scenario: TC-004 Verify clicking UPCOMING CONFERENCES.
 
Given I am On horizonsPage
When I hover over horizonUpcoming
And I click on horizonUpcoming
Then page URL should be horizons.aip.org
And The horizonUpcomingTitle should be Upcoming Conferences