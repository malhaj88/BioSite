Meta:
@production
Scenario: TC-013 Verify the "Latest articles (Bio Job Section)" section on Bioengineering Today home page. 

Given I am On bioengineerinPage
When The bio_Latest_Article_Container should display
Then I click on bio_Latest_Article