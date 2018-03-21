Meta:
@production
Scenario: TC-005 Verify clicking on Social media icons FaceBook Bio.
 
Given I am On bioengineerinPage
When I click on bio_Face_Img
And I switch tabs
Then page URL should be https://www.facebook.com/BioengineeringToday/