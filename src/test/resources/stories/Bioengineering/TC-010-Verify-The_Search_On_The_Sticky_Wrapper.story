
Scenario: TC-010 Verify the Search on the Sticky wrapper.

Given I am On bioengineerinPage
When The bio_Search_Icon should display
And I Fill Clinical to : bio_Search_field
And I click on bio_Search_Icon
Then The bio_Advance_Search should display