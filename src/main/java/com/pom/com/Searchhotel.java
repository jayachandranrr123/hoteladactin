package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
public static WebDriver driver;
	
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement Roomtypes;
	
	@FindBy(id = "room_nos")
	private WebElement Numerofrooms;
	
	@FindBy(id = "datepick_in")
	private WebElement Checkin;
	
	@FindBy(id = "datepick_out")
	 private WebElement Checkout;
	
	@FindBy(id = "adult_room")
	 private WebElement Adults;
	
	@FindBy(id = "child_room")
	private WebElement Childrens;
	
	@FindBy (id = "Submit")
	private WebElement searc;
	
	public WebElement getSearc() {
		return searc;
	}
	public void setSearc(WebElement searc) {
		this.searc = searc;
	}
	public Searchhotel(WebDriver driver3) {
this.driver = driver3;
PageFactory.initElements(driver3, this);
	
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtypes() {
		return Roomtypes;
	}
	public WebElement getNumerofrooms() {
		return Numerofrooms;
	}
	public WebElement getCheckin() {
		return Checkin;
	}
	public WebElement getCheckout() {
		return Checkout;
	}
	public WebElement getAdults() {
		return Adults;
	}
	public WebElement getChildrens() {
		return Childrens;
	}
	
	
	
}
