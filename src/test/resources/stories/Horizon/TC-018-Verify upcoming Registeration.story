Meta:
@production
Scenario: TC-018 Verify Upcoming Conferences Registration.

Given I am On horizonsPage
When I Click On cookie
And I Click On cookie
And I scroll to 500
And I click on targeted_Nucleic_Acid
And I switch tabs
Then The conference_Registration should display
And I click on conference_Registration_Link
And The conference_Registration_Title should be Conference Registration
