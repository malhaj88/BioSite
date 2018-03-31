Meta:
@production
Scenario: TC-015 Verify the Bioengineering Today Footer.

Given I am On bioengineerinPage
When The bio_Footer_Paragraph should be Bioengineering Today is an editorially independent news service of AIP Publishing
And The bio_Footer_About should display
Then The bio_Footer_Contact should display
And The bio_Footer_Privacy should display
And The bio_Facefooter_Img should display
And The bio_Twitterfooter_Img should display
And The bio_Linkedinfooter_Img should display
And The bio_Rssfooter_Img should display
Then The bio_Emailfooter_Img should display
