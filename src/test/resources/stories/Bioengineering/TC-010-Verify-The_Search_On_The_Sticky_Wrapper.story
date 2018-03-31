Meta:
@production
Scenario: TC-010 Verify the Search on the Sticky wrapper.

Given I am On bioengineerinPage
When The bio_Search_Icon should display
And I Fill Clinical to : bio_Search_field
And I Click On bio_Search_Icon
Then The bio_Advance_Search should display
And The bio_Article_From_Search should be Clinical 