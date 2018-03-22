Meta:
@production
Scenario: TC-022 Verify the Bioengineering Jobs section on right panel.

Given I am On bioengineerinPage
When The bio_Job_Title should display
And I click on bio_Job_Article
Then The bio_Job_Article_Logo should display