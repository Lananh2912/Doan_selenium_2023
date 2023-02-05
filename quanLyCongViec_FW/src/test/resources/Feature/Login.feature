Feature: Login page Quan ly Cong Viec

Scenario: Login page quan ly cong viec with input valid
Given title of login page is Quan Ly cong Viec
When user enters "<username>" and "<password>"
And user clicks on login button
Then user is on home pag

Examples:
	| username | password |
	| htha     | 1234		  | 