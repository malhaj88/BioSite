Meta:
@production
Scenario: TC-015 Verify Horizon privacy policy footer.

Given I am On horizonsPage
When I click on cookie
When I click on horizon_Footer_Privacy_Policy
And I switch tabs
Then The privacy_Policy_Page_Title should be Privacy Policy