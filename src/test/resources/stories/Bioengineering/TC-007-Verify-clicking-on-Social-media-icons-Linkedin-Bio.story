Meta:
@production
Scenario: TC-007 Verify clicking on Social media Icons Linkedin Bio.

Given I am On bioengineerinPage
When I Click On bio_Linkedin_Img
And I switch tabs
Then page URL should be https://www.linkedin.com