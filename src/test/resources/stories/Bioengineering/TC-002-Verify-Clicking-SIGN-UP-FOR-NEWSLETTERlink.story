Meta:
@production
Scenario: TC-002- Verify the Bioengineering  subscribe page. (Subscribe to Bioengineering Today Newsletter)
 
Given I am On bioengineerinPage
When I Click On bio_Sign_For_Alert
Then page URL should be https://bioengineeringtoday.org/subscribe-bioengineering-newsletter
And The bio_Subscribe_To_Newsletter should be Subscribe to Bioengineering Today Newsletter
