Meta:
@production
Scenario: TC-020 Verify the "SHARE" Social Media Links under the article image.

Given I am On bioengineerinPage
When I Click On bio_Article
Then The bio_Share_Face should display
And The bio_Share_Twitter should display
And The bio_Share_Reddit should display
And The bio_Share_Email should display
And The bio_Share_Print should display