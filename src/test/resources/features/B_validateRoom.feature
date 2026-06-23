@ValidateRoomAndExperience

Feature:  Select the room and Experiance

Scenario: Select the room and Experience
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
	 