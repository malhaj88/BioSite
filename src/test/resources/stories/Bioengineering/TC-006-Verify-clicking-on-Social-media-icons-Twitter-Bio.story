Meta:
@production
Scenario: TC-006 Verify clicking on Social media icons Twitter Bio.
 
Given I am On bioengineerinPage
When I Click On bio_Twitter_Img
And I switch tabs
Then page URL should be https://twitter.com/bioengtoday