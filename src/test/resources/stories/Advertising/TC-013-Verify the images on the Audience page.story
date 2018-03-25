Meta:
@production
Scenario: TC-013 Verify the images on the Audience page. 

Given I am On advertisingPage
When I click on advertising_Audience
Then The audience_Subject_Areas should be Subject Areas
And The audience_Subject_Areas_Imgs should display
And The audience_Industry_Application should be Industry Application
And The audience_Industry_Application_Imgs should display
And The audience_Readership should be Readership
And The audience_Readership_Img should display
And The audience_Global_Usage should be Global Usage
And The audience_Global_Usage_Img should display