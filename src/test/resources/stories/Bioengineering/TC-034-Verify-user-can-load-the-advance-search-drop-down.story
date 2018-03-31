Meta:
@production
Scenario: TC-034 Verify Advance Search.

Given I am On bioengineerinPage
When I Click On bio_Article
And The bio_Search_Icon should display
And I Fill Study  to : bio_Search_field
And I Click On bio_Search_Icon
And The bio_Advanced_Search should display
And I Click On bio_Advanced_Search
And I Fill Study  to : bio_Containing_Any_Of_Words
And I Fill Class  to : bio_Containing_The_Phrase
And I Fill Room  to : bio_Containing_None_Words
And I Click On bio_Advanced_Search_Dropdwon
Then The bio_Search_Result should display
