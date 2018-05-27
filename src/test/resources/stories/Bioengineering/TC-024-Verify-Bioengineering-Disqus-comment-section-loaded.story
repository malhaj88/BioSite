Meta:
@production
Scenario: TC-024 Verify the Disqus comment section is loaded.

Given I am On bioengineerinPage
When The bio_Job_More_Link should display
And I scroll To bio_More_Article_Button
And I click On Search bio_Job_More_Link
Then The bio_Job_More_Source should display