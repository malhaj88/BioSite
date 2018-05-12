Meta:
@production
Scenario: TC-016 Verify Horizon contact footer.

Given I am On horizonsPage
When I click on horizon_Footer_Contact
And I switch tabs
Then The contact_Page_Title should be Contact

