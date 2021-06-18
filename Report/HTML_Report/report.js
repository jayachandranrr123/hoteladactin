$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Userlogin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;userlogin",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cusername\u003e\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cpassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;userlogin;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;userlogin;;1"
    },
    {
      "cells": [
        "aaa",
        "123456"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;userlogin;;2"
    },
    {
      "cells": [
        "bbb",
        "987654"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;userlogin;;3"
    },
    {
      "cells": [
        "jayachandran123",
        "jayachandran123"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;userlogin;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Userlogin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;userlogin;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"aaa\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123456\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 17220378700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaa",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 242438800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 79878700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 491158700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Userlogin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;userlogin;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"bbb\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"987654\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 414379300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bbb",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 81017600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "987654",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 84448600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 407700400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Userlogin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;userlogin;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"jayachandran123\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"jayachandran123\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 274700800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jayachandran123",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 328590800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jayachandran123",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 100196200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 693195700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User Select The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Select The \"Sydney\" In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select The \"Hotel Sunshine\" In The Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Room Type In The Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Number Of Rooms In The Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The Check In Date In The Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter The Check Out Date In The Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Adults Per Room In The Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Children Per Room In The Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 17
    }
  ],
  "location": "Step_Defenition.user_Select_The_In_The_Location_Field(String)"
});
formatter.result({
  "duration": 442979300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 17
    }
  ],
  "location": "Step_Defenition.user_Select_The_In_The_Hotel_Field(String)"
});
formatter.result({
  "duration": 140571300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Room_Type_In_The_Room_Type_Field()"
});
formatter.result({
  "duration": 305774900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 142679500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field()"
});
formatter.result({
  "duration": 244483500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 207066100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Adults_Per_Room_In_The_Adults_Per_Room_Field()"
});
formatter.result({
  "duration": 144277200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Children_Per_Room_In_The_Children_Per_Room_Field()"
});
formatter.result({
  "duration": 370990600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 797540400,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "User Confirm The Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirm-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Select The Hotel In The Hotel Select Field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click The Continue Button And It Navigate To The Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Hotel_In_The_Hotel_Select_Field()"
});
formatter.result({
  "duration": 183825600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_The_Continue_Button_And_It_Navigate_To_The_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 706116200,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User Enters The Required Data",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-enters-the-required-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Enter The First Name In The First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Last Name In The Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Billing Address In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Credit Card Number In The Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select The Credit Card Type In The Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select The Month And Year In The Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select The Year In The Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter The Cvv Number In The Cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Click The Book Now Button And It Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_First_Name_In_The_First_Name_Field()"
});
formatter.result({
  "duration": 191282600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Last_Name_In_The_Last_Name_Field()"
});
formatter.result({
  "duration": 213858000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Billing_Address_In_The_Billing_Address_Field()"
});
formatter.result({
  "duration": 113501300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 156697700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 344731200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Month_And_Year_In_The_Expiry_Date_Field()"
});
formatter.result({
  "duration": 154970000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Year_In_The_Expiry_Date_Field()"
});
formatter.result({
  "duration": 309270400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field()"
});
formatter.result({
  "duration": 77001500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 66223700,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "User Logged Out",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-logged-out",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user Click The Logout Button And It Navigates To The Logged Out Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Click_The_Logout_Button_And_It_Navigates_To_The_Logged_Out_Page()"
});
formatter.result({
  "duration": 452795900,
  "status": "passed"
});
});