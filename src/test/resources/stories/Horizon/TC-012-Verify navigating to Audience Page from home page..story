Meta:
@production
Scenario: TC-012 Verify navigating to Audience Page from home page.

Given I am On advertisingPage
When I click on advertising_Audience
Then page URL should be https://advertising.aip.org/audience/
And The advertising_Page_Header should be Audience