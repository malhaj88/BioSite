Meta:
@production
Scenario: TC-025 Verify the Disqus comment section is loaded.

Given I am On bioengineerinPage
When I click on bio_Article
Then The bio_Footer_Contact should display
And The bio_Footer_Privacy should display
And The bio_Face_Img should display
And The bio_Twitter_Img should display
And The bio_Linkedin_Img should display
And The bio_Rss_Img should display
And The bio_Email_Img should display