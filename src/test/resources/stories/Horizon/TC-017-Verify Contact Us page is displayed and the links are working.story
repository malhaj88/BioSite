Meta:
@production
Scenario: TC-017  Verify Contact Us page is displayed and the links are working

Given I am On advertisingPage
When I click on adv_Footer_Contact
And I scroll To contact_Advertising_Department
Then The contact_Advertising_Department should be ADVERTISING DEPARTMENT
And I scroll To contact_Contactus_Directly
And The contact_Contactus_Directly should be CONTACT US DIRECTLY
