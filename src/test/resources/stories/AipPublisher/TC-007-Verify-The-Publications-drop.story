Meta:
@production
Scenario: TC-007 Verify The Publication Dropdwon
 
Given I am On aipPublishingPage
When The aip_Publications should be Publications
And I hover over aip_Publications
Then The aip_Publications_Aip should be AIP Journals
And The aip_Publications_Aapt should be AAPT Journals
And The aip_Publications_Aca should be ACA Journals
And The aip_Publications_Asa should be ASA Journals
And The aip_Publications_Avs should be AVS Journals
And The aip_Publications_Cps should be CPS Journals
And The aip_Publications_Lia should be LIA Journals
And The aip_Publications_Sor should be SOR Journals
And The aip_Publications_Conf_Proc should be Conference Proceedings
And The aip_Publications_PhsToday should be Physics Today
And The aip_Publications_Scitation should be Scitation