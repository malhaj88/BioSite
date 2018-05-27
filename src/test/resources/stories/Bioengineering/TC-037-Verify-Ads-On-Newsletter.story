Meta:
@production
Scenario: TC-037 Ads on the page (top and right panel) on Newsletter form page.

Given I am On bioengineerinPage
When I click On Search bio_Sign_For_Alert
And I scroll To bio_Logo
Then The bio_Top_Ad should display