Meta:
@production
Scenario: TC-033 Verify Advance Search.

Given I am On bioengineerinPage
When I Click On bio_Article
And The bio_Search_Icon should display
And I Fill Study  to : bio_Search_field
And I Click On bio_Search_Icon
Then The bio_Advanced_Search should display
And I Click On bio_Advanced_Search
And The bio_Advanced_Search_Button should display
