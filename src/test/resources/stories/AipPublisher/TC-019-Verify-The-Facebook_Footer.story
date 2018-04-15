Meta:
@production
Scenario: TC-019-Verify The facebook footer link.

Given I am On aipPublishingPage
When I click on aip_Facebook_Footer
And I switch tabs
Then page URL should be https://www.facebook.com/AIPPublishing