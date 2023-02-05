Feature: Login page Quan ly Cong Viec with input invalid

Scenario Outline: Login page quan ly cong viec with input invalid
Given user enters input invalid "<username>" and "<password>"
And user clicks on đăng nhâp button
Then Ui is show validatioon

Examples:
	| username | password |
	| htha1    | 1234 		| 
	| htha     | 12345    |
	| htha1		 | 12345    | 