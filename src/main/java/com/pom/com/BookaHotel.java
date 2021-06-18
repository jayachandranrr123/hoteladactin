package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaHotel {
public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement Firstname;
	
	@FindBy(id = "last_name")
	private WebElement Lastname;
	
	@FindBy(id = "address")
	private WebElement BillingAddress;
	
	@FindBy(id = "cc_num")
	private WebElement CreditcardNo;
	
	@FindBy(id = "cc_type")
	private WebElement CreditcardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement ExpiryMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement ExpiryYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement CvvNo;
	
	@FindBy(id = "book_now")
	private WebElement Booknow;
	
	
	public BookaHotel(WebDriver driver5) {
this.driver = driver5;
PageFactory.initElements(driver5, this);
	
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditcardNo() {
		return CreditcardNo;
	}

	public WebElement getCreditcardType() {
		return CreditcardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCvvNo() {
		return CvvNo;
	}

	public WebElement getBooknow() {
		return Booknow;
	}
	
}
