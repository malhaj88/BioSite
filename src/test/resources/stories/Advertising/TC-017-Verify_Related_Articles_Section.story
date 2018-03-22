Meta:
@production
Scenario: TC-017 Verify the Related Articles section (on right panel below the latest articles section).

Given I am On bioengineerinPage
When I click on bio_Article
And The bio_Related_Articles_Section should display
Then I click on bio_Related_Articles_Article
And The bio_Article_Title should display
And The bio_Logo should display
