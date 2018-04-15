Meta:
@production
Scenario: TC-016-Verify The Publications sections

Given I am On aipPublishingPage
When The aip_Publication_Title should be Publications
And I click on aip_Publication_Article
Then page URL should be scitation