Meta:
@production
Scenario: TC-018 Verify that First 5 articles are Bioengineering related articles, remaining from other areas.

Given I am On bioengineerinPage
When I click on bio_Article
Then The bio_Related_Articles_First should be Bioengineering Today
And The bio_Related_Articles_Second should be Bioengineering Today
And The bio_Related_Articles_Third should be Bioengineering Today
And The bio_Related_Articles_Fourth should be Bioengineering Today
And The bio_Related_Articles_Fifth should be Bioengineering Today
And The bio_Related_Articles_Sixth should not be Bioengineering Today
