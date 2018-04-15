Meta:
@production
Scenario: TC-012-Verify The Careers Dropdwon

Given I am On aipPublishingPage
When I hover over aip_Careers
Then The aip_Careers_Working should be Working at AIPP
And The aip_Careers_Opportunities should be Career Opportunities