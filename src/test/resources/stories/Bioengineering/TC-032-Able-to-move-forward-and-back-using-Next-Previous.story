Meta:
@production
Scenario: TC-032 Able to move forward and back using Next/Previous 

Given I am On bioengineerinPage
When I Click On bio_Article
And The bio_Search_Icon should display
And I Fill Study  to : bio_Search_field
And I Click On bio_Search_Icon
And I Click On bio_Search_Page_Next
And I Click On bio_Search_Page_Number
Then I Click On bio_Search_Page_Previous