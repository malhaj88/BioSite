Meta:
@production
Scenario:  TC-006 Verify clicking Contact link.
 
Given I am On horizonsPage
When I hover over horizonContact
And I click on horizonContact
Then page URL should be www.scitation.org/contact
And The horizonContactTitle should be Contact