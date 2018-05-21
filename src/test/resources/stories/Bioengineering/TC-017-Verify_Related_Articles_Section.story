Meta:
@production
Scenario: TC-017 Verify the Related Articles section (on right panel below the latest articles section).

Given I am On bioengineerinPage
When I Click On bio_Article
And wait for sec
And The bio_Related_Articles_Section should display
And I Click On bio_Related_Articles_Article
And The bio_Article_Title should display
Then The bio_Logo should display
