Meta:
@production
Scenario: TC-013 Verify Horizon footer section.

Given I am On horizonsPage
When I Click On cookie
And I Click On cookie
When The horizon_Footer_Home should be HOME
Then The horizon_Footer_Upcoming_Conferences should be UPCOMING CONFERENCES
And The horizon_Footer_Past_Conferences should be PAST CONFERENCES
And The horizon_Footer_Privacy_Policy should be PRIVACY POLICY
And The horizon_Footer_Contact should be CONTACT
And The horizon_Footer_Rights_Reserved should be 2018 AIP Publishing LLC. All rights reserved.