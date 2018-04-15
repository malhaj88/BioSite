Meta:
@production
Scenario: TC-011-Verify The Advertising Dropdwon

Given I am On aipPublishingPage
When I hover over aip_Advertisers
Then The aip_Librarians_Resources should be Advertising Resources
And The aip_Librarians_Exhibit should be Exhibit Management Services