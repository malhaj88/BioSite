Meta:
@production
Scenario: TC-015 Verify the Media Kit and Pricing Request forms load.

Given I am On advertisingPage
When I click on advertising_Mediakitpricing
Then The mediakitpricing_Required_Section should be Fields marked with an * are required
And The mediakitpricing_Form should display