Meta:
@production
Scenario: TC-017-Verify The Left article section

Given I am On aipPublishingPage
When The aip_Left_Article_Title should be Breaking Research from AIP Publishing
And I click on aip_Left_Article_Link
And I switch tabs
Then The aip_Logo should display