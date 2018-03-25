Meta:
@production
Scenario: TC-005 Verify clicking Print Advertising from home link.
 
Given I am On advertisingPage
When I click on Print_Advertising_Home_Link
Then The advertising_Page_Header should be Print Advertising
And I switch to window back
And I click on Print_Advertising_Home_Img
And The advertising_Page_Header should be Print Advertising 