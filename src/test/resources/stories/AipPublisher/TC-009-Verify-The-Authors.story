Meta:
@production
Scenario: TC-009-Verify The Authors Menu

Given I am On aipPublishingPage
When I click on aip_Authors
Then The page_Title should be Author Resource Center
