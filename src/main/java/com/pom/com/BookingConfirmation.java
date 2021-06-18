package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
public static WebDriver driver;
	
	@FindBy(id = "my_itinerary")
	private WebElement MyItinerary;
	
	
	@FindBy(id = "logout")
private WebElement logout;
 

@FindBy(xpath = "//a[@href='Logout.php']")
 private WebElement Mainlogout;
 
 public BookingConfirmation(WebDriver driver7) {
	 this.driver = driver7;
	 PageFactory.initElements(driver7, this);
}

public WebElement getMyItinerary() {
		return MyItinerary;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getMainlogout() {
		return Mainlogout;
	}
 
 
 
}
