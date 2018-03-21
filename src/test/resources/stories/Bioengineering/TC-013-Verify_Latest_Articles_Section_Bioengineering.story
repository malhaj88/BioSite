Meta:
@production
Scenario: TC-013 Verify the "Latest articles" section on Bioengineering Today home page. 

Given I am On bioengineerinPage
When I click on bio_Latest_Article_Container
Then The bio_Latest_Article should display