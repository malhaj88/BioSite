Meta:
@production
Scenario: TC-0095 Verify the Topics on the Sticky wrapper Emerging_Tech.

Given I am On bioengineerinPage
When I hover over bio_Emerging_Tech
And I click on bio_Emerging_All_Emerging_Tech
And The stickyWrapperTitle should be Emerging Tech
And I hover over bio_Emerging_Tech
And I click on bio_Emerging_Biosensors
And The stickyWrapperTitle should be Biosensors
And I hover over bio_Emerging_Tech
And I click on bio_Emerging_Computers_Medicine
And The stickyWrapperTitle should be Computers in Medicine
And I hover over bio_Emerging_Tech
And I click on bio_Emerging_Devices
And The stickyWrapperTitle should be Devices