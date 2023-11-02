Feature: Bellatrix

Scenario: Bellatrix Test
	Given Search result for Falcon Item
	When All results must contain Falcon word in the product title

Scenario:
	Given Search result for proton Item
	When All results must contain proton word in the product title

Scenario:
	Given Search result sort by popularity
	Then Result should be display by poularity
	
Scenario:
	Given Search Result sort by low to high Price
	Then Get all Price of low to high product 