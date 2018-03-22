Meta:
@production
Scenario: TC-034 Verify Advance Search.

Given I am On bioengineerinPage
When I click on bio_Article
And The bio_Search_Icon should display
And I Fill Study  to : bio_Search_field
And I click on bio_Search_Icon
When The bio_Advanced_Search should display
And I click on bio_Advanced_Search
And I Fill Study  to : bio_Containing_Any_Of_Words
And I Fill Class  to : bio_Containing_The_Phrase
And I Fill Room  to : bio_Containing_None_Words
And I click on bio_Advanced_Search_Dropdwon
Then The bio_Search_Result should display
