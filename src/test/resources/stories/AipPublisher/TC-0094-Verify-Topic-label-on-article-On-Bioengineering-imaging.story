Meta:
@production
Scenario: TC-0094 Verify the Topics on the Sticky wrapper Imaging.

Given I am On bioengineerinPage
When I hover over bio_Imaging
And I click on bio_Imaging_All_Imaging
And The stickyWrapperTitle should be Imaging
And I hover over bio_Imaging
And I click on bio_Imaging_CT_Scans
And The stickyWrapperTitle should be CT scans
And I hover over bio_Imaging
And I click on bio_Imaging_Diagnostic_Imaging
And The stickyWrapperTitle should be Diagnostic imaging
And I hover over bio_Imaging
And I click on bio_Imaging_Imaging_Research
And The stickyWrapperTitle should be Imaging for research
And I hover over bio_Imaging
And I click on bio_Imaging_Mri
And The stickyWrapperTitle should be MRI
And I hover over bio_Imaging
And I click on bio_Imaging_Ultrasound
And The stickyWrapperTitle should be Ultrasound