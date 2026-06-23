@ValidateGuest

Feature: Fill guest Info and Proceed to Pay

Scenario: Fill Guest Information and Proceed to Pay
	Given user is home page
	When user go to destination page
	And user select destination as "McLeodganj"
	And user select destination option as "McLeodganj, Bhagsu"
	And user select date from "2026-06-30" to "2026-07-25"
	Then available room should be displayed 
	Given user is room page
	And user select room type "Bed + Breakfast"
	And user add experiance "Paragliding"
	Then user click on "Proceed to unlock offers"
	Given user is on guest detail page
	And user enters first name "Jay"
	And user enters  last name "Pandya"
	And user enters mobile number "9876543210"
	And user enters email "jay098@gmail.com"
	Then user click on "Proceed to Pay"
	