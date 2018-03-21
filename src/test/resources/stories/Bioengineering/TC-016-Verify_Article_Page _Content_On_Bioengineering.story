Meta:
@production
Scenario: TC-016 Verify the Article page main content (Articles title, authors, Date, Article image & body of the article).

Given I am On bioengineerinPage
When I click on bio_Article
Then The bio_Article_Author should display
And The bio_Article_Title should display
And The bio_Article_Date should display
And The bio_Article_Image should display
And The bio_Article_Body should display
