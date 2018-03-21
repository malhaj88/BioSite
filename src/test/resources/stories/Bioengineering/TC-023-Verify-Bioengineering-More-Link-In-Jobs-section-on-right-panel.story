Meta:
@production
Scenario: TC-023 Verify the Bioengineering More Link Jobs section on right panel.

Given I am On bioengineerinPage
When The bio_Job_More_Link should display
And I click on bio_Job_More_Link
Then The bio_Job_More_Source should display