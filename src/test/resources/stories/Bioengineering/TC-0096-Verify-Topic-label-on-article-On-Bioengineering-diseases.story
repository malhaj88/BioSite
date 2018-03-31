Meta:
@production
Scenario: TC-0096 Verify the Topics on the Sticky wrapper Diseases.

Given I am On bioengineerinPage
When I hover over bio_Diseases
And I Click On bio_Diseases_All_Diseases
And The stickyWrapperTitle should be Diseases
And I hover over bio_Diseases
And I Click On bio_Diseases_Cancer
And The stickyWrapperTitle should be Cancer
And I hover over bio_Diseases
When I Click On bio_Diseases_Diabetes
And The stickyWrapperTitle should be Diabetes
And I hover over bio_Diseases
And I Click On bio_Diseases_Heart_Disease
Then The stickyWrapperTitle should be Heart disease
And I hover over bio_Diseases
And I Click On bio_Diseases_Infections
And The stickyWrapperTitle should be Infections