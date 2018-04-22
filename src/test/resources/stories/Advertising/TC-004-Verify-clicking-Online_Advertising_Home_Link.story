Meta:
@production
Scenario: TC-004 Verify clicking Online Advertising from home link.
 
Given I am On advertisingPage
When I click on Online_Advertising_Home_Link
Then The advertising_Page_Header should be Online Advertising
And I click on advertising_Home
And I click on Online_Advertising_Home_Img
And The advertising_Page_Header should be Online Advertising 