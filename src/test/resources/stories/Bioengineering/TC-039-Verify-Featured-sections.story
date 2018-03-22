Meta:
@production
Scenario: TC-039 Verify Featured Section

Given I am On bioengineerinPage
When The bio_Featured_Articles should display
Then The bio_Featured_Articles_Section should display
And The bio_Featured_Articles_Title should display
And The bio_Featured_Articles_Sticky_Wrapper should display
