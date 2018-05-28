Meta:
@production
Scenario: TC-017 Verify Upcoming Conferences Contents.

Given I am On horizonsPage
When I click on cookie
When I click on targeted_Nucleic_Acid
And I switch tabs
Then The conference_Home should be HOME
And The conference_Speakers should be SPEAKERS
And The conference_Program should be PROGRAM
And The conference_Abstracts should be ABSTRACTS
And The conference_Registration should be REGISTRATION
And The conference_Sponsorships should be SPONSORSHIP OPPORTUNITIES
And The conference_Contact should be CONTACT
