Meta:
@production
Scenario: TC-002- Verify the Header links Under advertisingoptions
 
Given I am On advertisingPage
When I hover over advertising_Advertisingoptions
And I click on adv_Advoptions_onlineadv
Then page URL should be https://advertising.aip.org/onlineadvertising/
And The advertising_Page_Header should be Online Advertising