Meta:
@production
Scenario: TC-010 Verify the footer Privacy Policy.

Given I am On advertisingPage
When I click on adv_Footer_Privacy_Policy
And I switch tabs
Then page URL should be https://www.scitation.org/privacy
And The adv_Scitation_Header should be Privacy Policy