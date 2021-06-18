package com.adactin.runner;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Adactin_Run {
public static Properties p ;
	public Adactin_Run() throws Throwable {

		File f = new File("C:\\Users\\user\\eclipse-workspace\\Adaction\\src\\test\\java\\com\\adaction\\helper\\Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
	
		p.load(fis);
	
	
	}
	
	public String get_browser() {
String browser = p.getProperty("browser");
		return browser;
	}
	
	public String get_url() {
String url = p.getProperty("url");
		return url;
		
	}
	public String get_creditcardno() {
String creditcardno = p.getProperty("creditcardno");
		return creditcardno;
	}
	public String get_cvv() {
String cvv = p.getProperty("cvv");
		return cvv;
		
	}
	
	
}
