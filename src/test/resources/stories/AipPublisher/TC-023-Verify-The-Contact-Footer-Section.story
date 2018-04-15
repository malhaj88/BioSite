Meta:
@production
Scenario: TC-023 Verify the contact footer section

Given I am On aipPublishingPage
When The aip_Footer_Llc should be 2018 AIP Publishing LLC
Then I click on aip_Footer_Contact
And The page_Title should be Contact Us