Meta:
@production
Scenario: TC-016 Verify the fields on the form (do not submit)

Given I am On advertisingPage
When I click on advertising_Mediakitpricing
And I Fill Bio to : mediakitpricing_First_Name
And I Fill Team to : mediakitpricing_Last_Name
And I Fill Aip to : mediakitpricing_Company_Name
And I Fill 1233211231 to : mediakitpricing_Phone
And I Fill TestAip@aip.org to : mediakitpricing_Email
And I Fill Quality Assurance to : mediakitpricing_Job_Title
And I hover over mediakitpricing_Agree_Policy
Then The mediakitpricing_Agree_Policy should display

