Meta:
@production
Scenario: TC-0097 Verify the Topics on the Sticky wrapper Drugs.

Given I am On bioengineerinPage
When I hover over bio_Drugs
And I click on bio_Drugs_All_Drugs
And The stickyWrapperTitle should be Drugs
And I hover over bio_Drugs
And I click on bio_Drugs_Drug_Research
And The stickyWrapperTitle should be Drug research
And I hover over bio_Drugs
And I click on bio_Drugs_Drugs
And The stickyWrapperTitle should be Drugs
And I hover over bio_Drugs
And I click on bio_Drugs_Vaccines
And The stickyWrapperTitle should be Vaccines