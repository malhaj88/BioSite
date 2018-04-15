Meta:
@production
Scenario: TC-026 Verify the privacy policy footer section

Given I am On aipPublishingPage
When I click on aip_Footer_Privacypolicy
And I switch tabs
Then page URL should be https://www.scitation.org/privacy
And The aip_Term_Page should be Privacy Policy