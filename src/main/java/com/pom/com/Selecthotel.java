package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement Radiobutton;
	
	@FindBy(id = "continue")
	private WebElement continuebt;
	
	
	
	public Selecthotel(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver4, this);
		
	}

	public WebElement getRadiobutton() {
		return Radiobutton;
	}

	public WebElement getContinuebt() {
		return continuebt;
	}

	
}
