Feature: Hotel Booking In Adactin Application

@SmokeTest
Scenario Outline: Userlogin
Given user Launch The Application
When user Enter The "<username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:
|username|password|
|aaa|123456|
|bbb|987654|
|jayachandran123|jayachandran123|

@SanityTest
Scenario: User Select The Hotel
When user Select The "Sydney" In The Location Field
And user Select The "Hotel Sunshine" In The Hotel Field
And user Select The Room Type In The Room Type Field
And user Select The Number Of Rooms In The Number Of Rooms Field
And user Enter The Check In Date In The Check In Date Field
And user Enter The Check Out Date In The Check Out Date Field
And user Select The Adults Per Room In The Adults Per Room Field
And user Select The Children Per Room In The Children Per Room Field
Then user Click The Search Button And It Navigates To The Select Hotel Page

@SanityTest
Scenario: User Confirm The Hotel
When user Select The Hotel In The Hotel Select Field
Then user Click The Continue Button And It Navigate To The Book A Hotel Page

@SanityTest
Scenario: User Enters The Required Data
When user Enter The First Name In The First Name Field
And user Enter The Last Name In The Last Name Field
And user Enter The Billing Address In The Billing Address Field 
And user Enter The Credit Card Number In The Credit Card Number Field
And user Select The Credit Card Type In The Credit Card Type Field
And user Select The Month And Year In The Expiry Date Field
And user Select The Year In The Expiry Date Field
And user Enter The Cvv Number In The Cvv Number Field
Then user Click The Book Now Button And It Navigates To The Booking Confirmation Page
  
  @SanityTest
  Scenario: User Logged Out
  Then user Click The Logout Button And It Navigates To The Logged Out Page