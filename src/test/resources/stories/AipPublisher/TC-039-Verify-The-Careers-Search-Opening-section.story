Meta:
@production
Scenario: TC-039 Verify the Search Openings section - on Career Opportunities page.

Given I am On aipPublishingPage
When I hover over aip_Careers
And I click on aip_Careers_Opportunities
And I switch to frame search_Frame
And I Fill Analyst to : search_Keyword
And I click on seach_Button
Then The search_Result_Table should display