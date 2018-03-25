Meta:
@production
Scenario: TC-006 Verify clicking Custom Advertising & Sponsorship Opportunities from home link.
 
Given I am On advertisingPage
When I click on Custom_Sponsorship_Home_Link
Then The advertising_Page_Header should be Custom Advertising & Sponsorship Opportunities
And I switch to window back
And I click on Custom_Sponsorship_Home_Img
And The advertising_Page_Header should be Custom Advertising & Sponsorship Opportunities