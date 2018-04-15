Meta:
@production
Scenario: TC-024 Verify the term of use footer section

Given I am On aipPublishingPage
When I click on aip_Footer_Termofuse
And I switch tabs
Then page URL should be https://www.scitation.org/terms
And The aip_Term_Page should be Terms Of Use