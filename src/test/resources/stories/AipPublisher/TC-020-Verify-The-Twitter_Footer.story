Meta:
@production
Scenario: TC-020-Verify The twitter footer link.

Given I am On aipPublishingPage
When I click on aip_Twitter_Footer
And I switch tabs
Then page URL should be https://twitter.com/aip_publishing