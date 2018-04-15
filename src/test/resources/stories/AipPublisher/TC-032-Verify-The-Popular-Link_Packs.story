Meta:
@production
Scenario: TC-032 Verify the pobular pacs link 

Given I am On aipPublishingPage
When I click on aip_Footer_Popular_Pacs_Link
Then page URL should be https://publishing.aip.org/publishing/pacs
And The page_Title should be Physics and Astronomy Classification Scheme