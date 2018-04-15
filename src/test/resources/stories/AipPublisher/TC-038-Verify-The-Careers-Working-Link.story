Meta:
@production
Scenario: TC-038 Verify the career working at aip

Given I am On aipPublishingPage
When I hover over aip_Careers
And I click on  aip_Careers_Working
Then The career_Extraordinary_People should be Extraordinary people
And The career_Who_We_Are should be Who We Are
And The career_What_We_Value should be What We Value
And The career_What_We_Do should be What We Do
And The career_What_We_Offer should be What We Offer