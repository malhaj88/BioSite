Meta:
@production
Scenario: TC-007 Verify The Publication Dropdwon
 
Given I am On aipPublishingPage
When The aip_Publications should be Publications
And I hover over aip_Publications
Then The aip_Publications_Aip should be About AIP Publishing
And The aip_Publications_Aapt should be Organization & Governance
And The aip_Publications_Aca should be Board of Managers
And The aip_Publications_Asa should be Leadership Team
And The aip_Publications_Avs should be AIP Publishing News
And The aip_Publications_Cps should be Organization & Governance
And The aip_Publications_Lia should be Board of Managers
And The aip_Publications_Sor should be Leadership Team
And The aip_Publications_Conf_Proc should be AIP Publishing News
And The aip_Publications_PhsToday should be Leadership Team
And The aip_Publications_Scitation should be AIP Publishing News