Meta:
@production
Scenario: TC-051 Alphabetical Index to PACS 2010

Given I am On aipPublishingPage
When I click on aip_Footer_Popular_Pacs_Link
Then page URL should be https://publishing.aip.org/publishing/pacs
And I scroll To pacs_Link
And I click on pacs_Link
And The alphabetical_Index should be Alphabetical Index to PACS 2010
And I click on alphabetical_Index
And The alphabetical_Index_Page_Title should be PACS 2010 ALPHABETICAL INDEX