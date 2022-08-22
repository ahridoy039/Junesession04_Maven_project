	@googlesearch
	Feature: Google Search
	
	Scenario Outline: simple search
	
	Given I am on google homepage
	When I enter search "<Term>"
	And I click on google search button
	Then I receive relevant results
	
	Examples:
	       |Term								|
	       |Quality Assurance		|
	       |Software Testing		| 

