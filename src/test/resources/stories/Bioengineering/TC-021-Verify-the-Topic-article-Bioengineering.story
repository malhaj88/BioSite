Meta:
@production
Scenario: TC-021 Verify the Topic of article (above the tile).

Given I am On bioengineerinPage
When I Click On bio_Article
And I Click On bio_Article_Topic
Then The bio_Topic_Header should display