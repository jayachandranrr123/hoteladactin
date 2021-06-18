package com.adaction.stepdefenition;

//import org.openqa.selenium.WebDriver;

import com.adactin.runner.File_Reader_Manager;
import com.adactin.runner.Page_Object_Manager;
//import com.google.gmail.Adacrunner.Test_Runner;
import com.google.gmail.Adaction.Baseclassn;
//import com.pom.com.BookaHotel;
//import com.pom.com.BookingConfirmation;
//import com.pom.com.Loginn;
//import com.pom.com.Searchhotel;
//import com.pom.com.Selecthotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defenition extends Baseclassn{
	
//public static WebDriver driver = Test_Runner.driver;
//public static Loginn login = new Loginn(driver);
//public static Searchhotel search = new Searchhotel(driver);	
//public static Selecthotel sele = new Selecthotel(driver);
//public static BookaHotel Book = new BookaHotel(driver);
//public static BookingConfirmation confirm = new BookingConfirmation(driver);
Page_Object_Manager pom = new Page_Object_Manager(driver);


@Given("^user Launch The Application$")


public void user_Launch_The_Application() throws Throwable {
	String url = File_Reader_Manager.getinstance().getinstanceAR().get_url();
	
	getthere(url);
}

//@When("^user Enter The Username In The Username Field$")
//public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {

@When("^user Enter The \"([^\"]*)\" In The Username Field$")
public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {

	send(pom.get_Instance_login().getUsername(), username);
}

//@When("^user Enter The Password In The Password Field$")
//public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {

@When("^user Enter The \"([^\"]*)\" In The Password Field$")
public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {

	send(pom.get_Instance_login().getPassword(), password);
}

@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	
	clickit(pom.get_Instance_login().getLoginbt());
}

//@When("^user Select The Location In The Location Field$")
//public void user_Select_The_Location_In_The_Location_Field() throws Throwable {

@When("^user Select The \"([^\"]*)\" In The Location Field$")
public void user_Select_The_In_The_Location_Field(String locat) throws Throwable {
	
	selectvalue(pom.get_Instance_search().getLocation(), locat);
	
}

//@When("^user Select The Hotel In The Hotel Field$")
//public void user_Select_The_Hotel_In_The_Hotel_Field() throws Throwable {
@When("^user Select The \"([^\"]*)\" In The Hotel Field$")
public void user_Select_The_In_The_Hotel_Field(String hotel) throws Throwable {

	selectvalue(pom.get_Instance_search().getHotels(), hotel);
}

@When("^user Select The Room Type In The Room Type Field$")
public void user_Select_The_Room_Type_In_The_Room_Type_Field() throws Throwable {
	selectvalue(pom.get_Instance_search().getRoomtypes(), "Deluxe");
}

@When("^user Select The Number Of Rooms In The Number Of Rooms Field$")
public void user_Select_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
	selectvalue(pom.get_Instance_search().getNumerofrooms(), "5");
}

@When("^user Enter The Check In Date In The Check In Date Field$")
public void user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {
	send(pom.get_Instance_search().getCheckin(), "15/06/2021");
}

@When("^user Enter The Check Out Date In The Check Out Date Field$")
public void user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {
	send(pom.get_Instance_search().getCheckout(), "17/06/2021");
}

@When("^user Select The Adults Per Room In The Adults Per Room Field$")
public void user_Select_The_Adults_Per_Room_In_The_Adults_Per_Room_Field() throws Throwable {
	selectvalue(pom.get_Instance_search().getAdults(), "3");
}

@When("^user Select The Children Per Room In The Children Per Room Field$")
public void user_Select_The_Children_Per_Room_In_The_Children_Per_Room_Field() throws Throwable {
	selectvalue(pom.get_Instance_search().getChildrens(), "3");
}

@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	clickit(pom.get_Instance_search().getSearc());
}

@When("^user Select The Hotel In The Hotel Select Field$")
public void user_Select_The_Hotel_In_The_Hotel_Select_Field() throws Throwable {
	clickit(pom.get_Instance_sele().getRadiobutton());
	
}

@Then("^user Click The Continue Button And It Navigate To The Book A Hotel Page$")
public void user_Click_The_Continue_Button_And_It_Navigate_To_The_Book_A_Hotel_Page() throws Throwable {
	clickit(pom.get_Instance_sele().getContinuebt());
}

@When("^user Enter The First Name In The First Name Field$")
public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
	send(pom.get_Instance_book().getFirstname(), "pal");
}

@When("^user Enter The Last Name In The Last Name Field$")
public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
	send(pom.get_Instance_book().getLastname(), "stark");
}

@When("^user Enter The Billing Address In The Billing Address Field$")
public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
	send(pom.get_Instance_book().getBillingAddress(), "no.121, norway, west");
}

@When("^user Enter The Credit Card Number In The Credit Card Number Field$")
public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {
	String creditcardno = File_Reader_Manager.getinstance().getinstanceAR().get_creditcardno();
	
	send(pom.get_Instance_book().getCreditcardNo(), creditcardno );
}	


@When("^user Select The Credit Card Type In The Credit Card Type Field$")
public void user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
	selectvalue(pom.get_Instance_book().getCreditcardType(), "VISA");
}

@When("^user Select The Month And Year In The Expiry Date Field$")
public void user_Select_The_Month_And_Year_In_The_Expiry_Date_Field() throws Throwable {
	selectvalue(pom.get_Instance_book().getExpiryMonth(), "12");
}

@When("^user Select The Year In The Expiry Date Field$")
public void user_Select_The_Year_In_The_Expiry_Date_Field() throws Throwable {
	selectvalue(pom.get_Instance_book().getExpiryYear(), "2022");
}

@When("^user Enter The Cvv Number In The Cvv Number Field$")
public void user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
	String cvv = File_Reader_Manager.getinstance().getinstanceAR().get_cvv();
	send(pom.get_Instance_book().getCvvNo(), cvv);
}

@Then("^user Click The Book Now Button And It Navigates To The Booking Confirmation Page$")
public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
clickit(pom.get_Instance_book().getBooknow());
}

@Then("^user Click The Logout Button And It Navigates To The Logged Out Page$")
public void user_Click_The_Logout_Button_And_It_Navigates_To_The_Logged_Out_Page() throws Throwable {
	clickit(pom.get_Instance_confirm().getMainlogout());
}


	
	
	
	
	
	
	
}
