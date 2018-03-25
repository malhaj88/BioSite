Meta:
@production
Scenario: TC-007 Verify the images on home page.

Given I am On advertisingPage
When The Online_Advertising_Home_Img should display
Then The Print_Advertising_Home_Img should display
And The Custom_Sponsorship_Home_Img should display