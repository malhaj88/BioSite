Meta:
@production
Scenario: TC-012 Verify the Ads on Bioengineering Today home page (top and right panel).

Given I am On bioengineerinPage
When The bio_Top_Ad should display
Then The right_Ad should display