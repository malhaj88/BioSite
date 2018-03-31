Meta:
@production
Scenario: TC-003 Verify clicking on "About" link.
 
Given I am On bioengineerinPage
When I Click On bio_About
Then The bio_About_Title should be About Bioengineering Today