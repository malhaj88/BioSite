Meta:
@production
Scenario: TC-050 Verify The Pacs link

Given I am On aipPublishingPage
When I click on aip_Footer_Popular_Pacs_Link
Then page URL should be https://publishing.aip.org/publishing/pacs
And I click on pacs_Link
And The page_Title should be PACS 2010 Regular Edition