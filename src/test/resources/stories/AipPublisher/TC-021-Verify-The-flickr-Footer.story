Meta:
@production
Scenario: TC-021 Verify The flickr footer link.

Given I am On aipPublishingPage
When I click on aip_Flickr_Footer
And I switch tabs
Then page URL should be https://www.flickr.com/photos/39565660@N03/sets/