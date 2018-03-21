Meta:
@production
Scenario: TC-035 Verify user can search using any of the fields (e.g. therapy)

Given I am On bioengineerinPage
When I click on bio_Article
And The bio_Search_Icon should display
And I Fill Study  to : bio_Search_field
And I click on bio_Search_Icon
When The bio_Advanced_Search should display
And I click on bio_Advanced_Search
And I Fill therapy  to : bio_Containing_Any_Of_Words
And I click on bio_Advanced_Search_Button
Then The bio_Search_Result should display
And The bio_Article_From_Search should be Therapy