Meta:
@production
Scenario: TC-011 Verify the Copyright section on the footer.

Given I am On advertisingPage
Then The adv_Copyright should be 2017 AIP Publishing. All rights reserved.