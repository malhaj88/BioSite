Meta:
@production
Scenario: TC-003 Verify clicking Advertising options from Home Link
 
Given I am On advertisingPage
When I click on adv_Home_Advertising_Options
Then The bio_About_Title should be Advertising Options
And The Advoption_Page_Online_Advertising should display
And The Advoption_Page_Print_Advertising should display
And The Advoption_Page_Custom_Sponsorship should display