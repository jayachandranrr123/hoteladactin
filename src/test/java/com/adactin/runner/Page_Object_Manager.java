package com.adactin.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.BookaHotel;
import com.pom.com.BookingConfirmation;
import com.pom.com.Loginn;
import com.pom.com.Searchhotel;
import com.pom.com.Selecthotel;

public class Page_Object_Manager {

	//public static Loginn login = new Loginn(driver);
	//public static Searchhotel search = new Searchhotel(driver);	
	//public static Selecthotel sele = new Selecthotel(driver);
	//public static BookaHotel Book = new BookaHotel(driver);
	//public static BookingConfirmation confirm = new BookingConfirmation(driver);
public WebDriver driver ;
	private Loginn login;
	private Searchhotel search;
	private Selecthotel sele;
	private BookaHotel Book;
	private BookingConfirmation confirm;
	
	
	
	public Page_Object_Manager(WebDriver driver11) {

	this.driver = driver11;
	PageFactory.initElements(driver11, this);
	
	}

	public  Loginn get_Instance_login() {

		login = new Loginn(driver);
		return login;
		
	}
	
	public Searchhotel get_Instance_search() {
		search = new Searchhotel(driver);
		return search ;
	}
	
	public Selecthotel get_Instance_sele() {

		sele = new Selecthotel(driver);
		return sele;
		
	}

	public BookaHotel get_Instance_book() {

		Book = new BookaHotel(driver);
		return Book;
		
	}
	
	public BookingConfirmation get_Instance_confirm() {
confirm = new BookingConfirmation(driver);
		return confirm;
	}
	
	
}
