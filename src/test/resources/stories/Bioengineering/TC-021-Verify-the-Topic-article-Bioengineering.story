Meta:
@production
Scenario: TC-021 Verify the Topic of article (above the tile).

Given I am On bioengineerinPage
When I click On Search bio_Article
And I click On Search bio_Article_Topic
Then The bio_Topic_Header should display