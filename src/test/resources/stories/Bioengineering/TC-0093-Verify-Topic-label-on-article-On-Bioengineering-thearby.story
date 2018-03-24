Meta:
@production
Scenario: TC-0093 Verify the Topics on the Sticky wrapper Therapy.

Given I am On bioengineerinPage
When I hover over bio_Therapy
And I click on bio_Therapy_All_Therapy
And The stickyWrapperTitle should be Therapy
And I hover over bio_Therapy
And I click on bio_Therapy_Cell_Reprogramming
And The stickyWrapperTitle should be Cell reprogramming
And I hover over bio_Therapy
And I click on bio_Therapy_Radiation_Therapy
And The stickyWrapperTitle should be Radiation therapy
And I hover over bio_Therapy
And I click on bio_Therapy_Surgery
And The stickyWrapperTitle should be Surgery
And I hover over bio_Therapy
And I click on bio_Therapy_Tissue_Engineering
And The stickyWrapperTitle should be Tissue engineering