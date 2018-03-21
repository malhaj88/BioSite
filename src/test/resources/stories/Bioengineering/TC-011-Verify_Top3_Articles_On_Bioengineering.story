Meta:
@production
Scenario: TC-011 Verify the Top 3 articles on Bioengineering Today home page.

Given I am On bioengineerinPage
When The bio_Top_Article1 should display
And The bio_Article1_Abstract should display
And The bio_Article1_Title should display
And The bio_Top_Article2 should display
And The bio_Article2_Abstract should display
And The bio_Article2_Title should display
And The bio_Top_Article3 should display
And The bio_Article3_Abstract should display
And The bio_Article3_Title should display