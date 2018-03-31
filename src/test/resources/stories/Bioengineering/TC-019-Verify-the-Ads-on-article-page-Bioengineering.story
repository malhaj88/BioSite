Meta:
@production
Scenario: TC-019 Verify the Ads on article page (top and right panel).

Given I am On bioengineerinPage
When I Click On bio_Article
Then The bio_Top_Ad should display
And The bio_Second_Ad should display