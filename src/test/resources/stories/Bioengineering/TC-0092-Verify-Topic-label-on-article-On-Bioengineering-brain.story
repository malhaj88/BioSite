Meta:
@production
Scenario: TC-0092 Verify the Topics on the Sticky wrapper Brain.

Given I am On bioengineerinPage
When I hover over bio_Brain
When I Click On bio_Brain_All_Brain
And The stickyWrapperTitle should be Brain
And I hover over bio_Brain
When I Click On bio_Brain_Brain_Diseases
And The stickyWrapperTitle should be Brain Diseases
And I hover over bio_Brain
And I Click On bio_Brain_Neurobiology
And The stickyWrapperTitle should be Neurobiology
And I hover over bio_Brain
And I Click On bio_Brain_Neuroengineering
Then The stickyWrapperTitle should be Neuroengineering