Meta:
@production
Scenario: TC-014 Verify the advertising link direct user to the advertising options main page

Given I am On advertisingPage
When I click on advertising_Audience
And I click on audience_Customize_Advertising_Package
Then The advertising_Page_Header should be Advertising Options