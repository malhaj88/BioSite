Meta:
@production
Scenario: TC-034 Verify Advance Search.

Given I am On bioengineerinPage
When I click On Search bio_Article
And The bio_Search_Icon should display
And I Fill Study  to : bio_Search_field
And I click On Search bio_Search_Icon
And The bio_Advanced_Search should display
And I scroll To bio_Search_Form
And I click On Search bio_Advanced_Search
And I scroll To bio_Containing_Any_Of_Words
And I Fill Study  to : bio_Containing_Any_Of_Words
And I Fill Class  to : bio_Containing_The_Phrase
And I Fill Room  to : bio_Containing_None_Words
And I click On Search bio_Advanced_Search_Button
Then The bio_Search_Result should display
