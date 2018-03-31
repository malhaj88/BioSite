Meta:
@production
Scenario: TC-037 Ads on the page (top and right panel) on Newsletter form page.

Given I am On bioengineerinPage
When I Click On bio_Sign_For_Alert
Then The bio_Top_Ad should display
And The bio_Second_Ad should display