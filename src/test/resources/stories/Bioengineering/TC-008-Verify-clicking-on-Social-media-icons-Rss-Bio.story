Meta:
@production
Scenario: TC-008 Verify clicking on Social media icons Rss Bio.

Given I am On bioengineerinPage
When I click on bio_Rss_Img
And I switch tabs
Then The bio_Rss_Title should be Bioengineering Today