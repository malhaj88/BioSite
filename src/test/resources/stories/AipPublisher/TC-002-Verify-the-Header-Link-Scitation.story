Meta:
@production
Scenario: TC-002-Verify the Header Link Scitation.
 
Given I am On aipPublishingPage
When I click on aippublish_Scitation_Link
Then page URL should be https://www.scitation.org/
And The aippublish_Scitation_Title should be Scitation
