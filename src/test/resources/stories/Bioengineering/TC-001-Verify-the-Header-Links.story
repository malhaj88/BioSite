Meta:
@production
Scenario: TC-001-Verify the Header Links.
 
Given I am On bioengineerinPage
When The bio_Sign_For_Alert should display
Then The bio_About should display
And The bio_Contact should display
And The bio_Face_Img should display
And The bio_Twitter_Img should display
And The bio_Linkedin_Img should display
And The bio_Rss_Img should display