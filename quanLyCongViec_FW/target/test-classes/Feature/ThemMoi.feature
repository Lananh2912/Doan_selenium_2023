Feature: Them Moi Cong Viec page Quan ly Cong Viec

Scenario: Them moi cong viec tai trang quang ly cong viev

Given user enters valid "<username>" and "<password>"
And   click on login button  
When  click tag Quan ly cong viec and click button them moi
And   user enter input information cong viec "<tenCongViec>" and "<moTa>" and thong tin khac
And   click button them moi
When  click tag quan ly cong viec
And   user enter ten cong viec moi "<tenCongViec>"
Then Verify new cong viec is correctly displayed on quan ly cong viec window

Examples:
	| username | password | |tenCongViec|     |moTa|          
	| htha     | 1234 		| |automation_test33| 			|thuc hien do an|
	
	
