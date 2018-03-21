Meta:
@production
Scenario: TC-031 Verify the existance of Next/Previous buttons.

Given I am On bioengineerinPage
When I click on bio_Article
And The bio_Search_Icon should display
And I Fill Study  to : bio_Search_field
And I click on bio_Search_Icon
Then The bio_Search_Page_Next should display
And The bio_Search_Page_Number should display
And The bio_Search_Page_Previous should display