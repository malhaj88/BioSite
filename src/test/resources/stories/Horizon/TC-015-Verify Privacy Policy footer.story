Meta:
@production
Scenario: TC-015 Verify Horizon privacy policy footer.

Given I am On horizonsPage
When I Click On cookie
And I Click On cookie
And I scroll to 1000
And I click on horizon_Footer_Privacy_Policy
And I switch tabs
Then The privacy_Policy_Page_Title should be Privacy Policy