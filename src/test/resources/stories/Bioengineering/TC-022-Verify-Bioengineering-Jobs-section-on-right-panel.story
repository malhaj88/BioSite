Meta:
@production
Scenario: TC-022 Verify the Bioengineering Jobs section on right panel.

Given I am On bioengineerinPage
When The bio_Job_Title should display
And I scroll To bio_Job_Title_Section
And I click On Search bio_Job_Article
Then The bio_Job_Article_Logo should display