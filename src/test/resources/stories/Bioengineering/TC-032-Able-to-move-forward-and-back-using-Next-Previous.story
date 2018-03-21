Meta:
@production
Scenario: TC-032 Able to move forward and back using Next/Previous 

Given I am On bioengineerinPage
When I click on bio_Article
And The bio_Search_Icon should display
And I Fill Study  to : bio_Search_field
And I click on bio_Search_Icon
Then I click on bio_Search_Page_Next
And I click on bio_Search_Page_Number
And I click on bio_Search_Page_Previous