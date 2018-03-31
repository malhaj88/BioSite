Meta:
@production
Scenario: TC-036 Verify user can search using any of the fields (e.g. therapy)

Given I am On bioengineerinPage
When I Click On bio_Sign_For_Alert
Then The bio_Subscribe_Newsletter should be Subscribe to Bioengineering Today Newsletter
And The bio_News_First_Name should be First name
And The bio_News_Last_Name should be Last name
And The bio_News_Email should be Email address
And The bio_News_Primary_Research should be Primary field of research
And The bio_News_Other_Field should be Other field
And The bio_News_Country should be Country
And The bio_News_Company should be Company/University
And The bio_News_Submit should display