Meta:
@production
Scenario: TC-030 Verify user can jump to different page on the search page

Given I am On bioengineerinPage
When I click on bio_Article
And The bio_Search_Icon should display
And I Fill disease  to : bio_Search_field
And I click random bio_Search_Icon
Then The bio_Article_From_Search should be disease