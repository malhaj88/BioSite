Meta:
@production
Scenario: TC-028 Load the article from search result.

Given I am On bioengineerinPage
When I Click On bio_Article
And The bio_Search_Icon should display
And I Fill Clinical to : bio_Search_field
And I click On Search bio_Search_Icon
And I click On Search bio_Article_From_Search
Then The bio_Article_Topic should display