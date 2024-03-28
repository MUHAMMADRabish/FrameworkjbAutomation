@regression
Feature: Docket Home Page 
Docket home page for automation  framework

Background:
	Given opens the application
	@test_7
	Scenario Outline: Docekt home page 
	Automation testing for Docket forms
	When user entered  user id "<UserName>" on login page
	And I clicked on Next button on login page
	And I entered the password "<Password>" on login page
	And I clicked on signIn button
	And I clicked on Yes button on stay signedIn page
	When I clicked on New button on home page
	#And I entered the "<Name>" field on General Info page
	And I clicked on  the Type drop down on General Info section
	And I clicked on Board Office Type on General Info section
	And I clicked on  the Sub Type drop down on General Info section
	And I entered the Claim Number "<Claim Number>" from Info page
	Examples:
|UserName|Password|Claim Number|
|||6|

	