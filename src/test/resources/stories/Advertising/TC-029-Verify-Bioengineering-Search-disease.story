Meta:
@production
Scenario: TC-029 Search on a topic (e.g. disease).

Given I am On bioengineerinPage
When I click on bio_Article
And The bio_Search_Icon should display
And I Fill disease  to : bio_Search_field
And I click on bio_Search_Icon
Then The bio_Article_From_Search should be disease