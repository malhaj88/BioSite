Meta:
@production
Scenario: TC-037 Ads on the page (top and right panel) on Newsletter form page.

Given I am On bioengineerinPage
When I click on bio_Sign_For_Alert
Then The bio_Top_Frame should display
And The bio_Second_Frame should display