Meta:
@production
Scenario: TC-008-Verify The Librarians Dropdwon 

Given I am On aipPublishingPage
When The aip_Librarians should be Librarians
And I hover over aip_Librarians
Then The aip_Librarians_Product should be 2018 Product Guide
And The aip_Librarians_User should be User Guides
And The aip_Librarians_Pricing should be Pricing & Licensing
And The aip_Librarians_Matters should be Library Matters Newsletter
And The aip_Librarians_Promotional should be Promotional Material