@SelectPlace

Feature: Select the Place and date

Scenario: Select the Destination and Date
	Given user is home page
	When user go to destination page
	And user select destination as "McLeodganj"
	And user select destination option as "McLeodganj, Bhagsu"
	And user select date from "2026-06-30" to "2026-07-25"
	Then available room should be displayed