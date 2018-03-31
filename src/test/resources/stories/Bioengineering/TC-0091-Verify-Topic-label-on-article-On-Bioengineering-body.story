Meta:
@production
Scenario: TC-0091 Verify the Topics on the Sticky wrapper Body.

Given I am On bioengineerinPage
When I hover over bio_Body
And I Click On bio_Body_All_Body
And The stickyWrapperTitle should be Body
And I hover over bio_Body
And I Click On bio_Body_Aging
And The stickyWrapperTitle should be Aging
And I hover over bio_Body
And I Click On bio_Body_Genetic_Engineering
And The stickyWrapperTitle should be Genetic engineering
And I hover over bio_Body
And I Click On bio_Body_Prevention
And The stickyWrapperTitle should be Prevention
And I hover over bio_Body
And I Click On bio_Body_Regenerative_Medicine
Then The stickyWrapperTitle should be Regenerative medicine