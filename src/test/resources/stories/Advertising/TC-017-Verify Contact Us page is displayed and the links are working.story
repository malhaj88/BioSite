Meta:
@production
Scenario: TC-017  Verify Contact Us page is displayed and the links are working

Given I am On advertisingPage
When I click on adv_Footer_Contact
Then The contact_Advertising_Department should be ADVERTISING DEPARTMENT
And The contact_Contactus_Directly should be CONTACT US DIRECTLY
