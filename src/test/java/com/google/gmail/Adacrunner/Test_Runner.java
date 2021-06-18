package com.google.gmail.Adacrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.File_Reader_Manager;
import com.google.gmail.Adaction.Baseclassn;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//java//com//adaction//feature" ,       
glue="com.adaction.stepdefenition" ,
monochrome= true ,
dryRun= false ,
strict= false ,
tags= ("@SmokeTest,@SanityTest,@SanityTest,@SanityTest,@SanityTest"),
plugin= {"html:Report/HTML_Report",
		"pretty" ,
		"json:Report/CucumberJSON_Report.json" ,
"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"}
		)



public class Test_Runner {
	public static WebDriver driver;
	
	@BeforeClass
public static void Set_up() throws Throwable {
		String browser = File_Reader_Manager.getinstance().getinstanceAR().get_browser();
		driver = Baseclassn.BrowserLaunch(browser);
		
}
	
	
	@AfterClass
	public static void Tear_down() {
driver.close();
	}
	
	
	
	
	

}
