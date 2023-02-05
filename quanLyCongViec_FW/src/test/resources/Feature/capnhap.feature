Feature: Cap Nhap Cong Viec page Quan ly Cong Viec

Scenario: Cap nhap cong viec tai trang quang ly cong viec

Given user enters valid "<username>", "<password>"
When click tag Quan ly cong viec 
And  user enter input information cong viec "<tenCongViec>" 
And  click button cap nhap
And  user enter input cap nhap cong viec: "<tencongvieccapnhap>","<mota>"
And  user enter input information cong viec "<tencongvieccapnhap>"
Then Verify update cong viec success
When user click button tam dung and popup button yes
Then Verify tam dung cong viec success

Examples:
	| username | password | |tenCongViec		 | |tencongvieccapnhap | |mota|          
	| htha     | 1234 		| |automation_test33| |do an selenium_auto50 | |do an hoan thien|
	
	
				