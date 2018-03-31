Meta:
@production
Scenario: TC-013 Verify the "Latest articles (Bio Job Section)" section on Bioengineering Today home page. 

Given I am On bioengineerinPage
When The bio_Latest_Article_Container should display
And I scroll To bio_Latest_Article
Then I Click On bio_Latest_Article
And The Physics_Logo should display