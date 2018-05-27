Meta:
@production
Scenario: TC-023 Verify the Bioengineering More Link Jobs section on right panel.

Given I am On bioengineerinPage
When The bio_Job_More_Link should display
And I hover over bio_Job_More_Link
And I scroll To bio_More_Article_Button
And I click On Search bio_Job_More_Link
Then The bio_Job_More_Source should display