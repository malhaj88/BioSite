Meta:
@production
Scenario: TC-020 Verify Scitation Contact header and footer

Given I am On horizonsPage
When I Click On cookie
And I Click On cookie
When I hover over horizonContact
And I click on horizonContact
And I scroll to 1000
Then The AUTHOR should display
And The LIBRARIAN should display
And The ADVERTISER should display
And The ABOUT should display
And The CONTACT should display
And The HELP should display
And The PRIVACY_POLICY should display
And The TERMS_OF_USE should display
And The Facebook_Icon should display
And The Twitter_Icon should display
And The Linkedin_Icon should display