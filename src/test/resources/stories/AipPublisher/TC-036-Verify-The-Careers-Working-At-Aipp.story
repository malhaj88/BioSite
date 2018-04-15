Meta:
@production
Scenario: TC-036 Verify the career working at aipp 

Given I am On aipPublishingPage
When I hover over aip_Careers
And I click on  aip_Careers_Working
Then page URL should be https://publishing.aip.org/working
And The page_Title should be Working at AIP Publishing