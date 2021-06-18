package com.google.gmail.Adaction;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Baseclassn {

public static WebDriver driver;
		//browserLaunch
	public static WebDriver BrowserLaunch(String browse) {
	try {
		if (browse.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Miniprojthree\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.out.println("invalid");
		}
	} catch (Exception e) {
		
	}
	return driver;

	}


	//maximise
	public static void maximise() {
	try {
		driver.manage().window().maximize();
	} catch (Exception e) {
		
	}	
	}
	//close
	public static void closeit() {
	try {
		driver.close();
	} catch (Exception e) {
		
	}
	}	
	//navigate to
		public static void Navigatefwd(String moveon) {
	try {
		driver.navigate().to(moveon);
	} catch (Exception e) {
		
	}
		}
		//navigate back
		public static void NavigateBack() {
	try {
		driver.navigate().back();
	} catch (Exception e) {
	}
		}
		//refresh
		public static void Refreshit() {
	try {
		driver.navigate().refresh();
	} catch (Exception e) {
		
	}
		}
		//get
		public static void getthere(String url) {
	try {
		driver.get(url);
	} catch (Exception e) {
		
	}
		}
		//alert
		public static void alertaccept() {
	try {
		Alert acc = driver.switchTo().alert();
		acc.accept();
	} catch (Exception e) {
		
	}
		}
		public static void alertdismiss() {
	try {
		Alert dis = driver.switchTo().alert();
		dis.dismiss();
	} catch (Exception e) {
		
	}
		}
		//actions
		public static void contextactions(WebElement element) {
	try {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	} catch (Exception e) {
		
	}
		}
		public static void movetoactions(WebElement element) {
	try {
		Actions af = new Actions(driver);
		af.moveToElement(element).build().perform();
	} catch (Exception e) {
		
	}
		}
		//frame
		public static void singleframeswitch(String fram) {
		try {
			driver.switchTo().frame(fram);
		} catch (Exception e) {
			
		}	
		}
		
		public static void comeoutofframe() {
	try {
		driver.switchTo().defaultContent();
	} catch (Exception e) {
			}
		}
		
		
		public static void multiframe(WebElement element) {
	try {
		driver.switchTo().frame(element);
	} catch (Exception e) {
			}
		}
		
		//DOWNKEY
		public static void Downpress() throws Throwable  {
	try {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	} catch (Exception e) {
	
	}
		}
		
		//Enter press
		public static void Enterpress() throws Throwable {
	try {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	} catch (Exception e) {
		
	}
		}
		
		//windows handling
		public static void Windowhandles() {
	try {
		driver.getWindowHandles();
	} catch (Exception e) {
		
	}
		}
		
		//single drop down
		public static void selectvalue(WebElement element, String value) {
	try {
		Select s = new Select(element);
		s.selectByValue(value);;
	} catch (Exception e) {
		
	}
		}
		
		public static void selecttext(WebElement element, String value) {
	try {
		Select s= new Select(element);
		s.selectByVisibleText(value);
	} catch (Exception e) {
	
	}
		}
		
		//is multiple
		public static void checkmultiple(WebElement element) {
	try {
		Select s = new Select(element);
		s.isMultiple();
	} catch (Exception e) {
		
	}		
		}
		
		//get options
		public static void getoptions(WebElement element) {
		try {
			Select s = new Select(element);
			s.getOptions();
		} catch (Exception e) {
			
		}
	}
		
	//get text
		public static void gettext(WebElement element) {
	try {
		element.getText();
	} catch (Exception e) {
			}
		}
		
		
	//all selected
	public static void getallthem(WebElement element) {
	try {
		Select s = new Select(element);
		s.getAllSelectedOptions();
	} catch (Exception e) {
		
	}
			}
	
	//first selected
	public static void firstselected(WebElement element) {
	try {
		Select s = new Select(element);
		s.getFirstSelectedOption();
	} catch (Exception e) {
	
	}
	}
	
	//scroll down
	public static void scrolldown(WebElement element , String data) {
	try {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript(data, element);
	} catch (Exception e) {
		
	}

	}
	
	//scroll up
	public static void scrollup(WebElement element , String data) {
	try {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
			js.executeScript(data, element);
	} catch (Exception e) {
		
	}
		
	}
	
	//implicit wait
	public static void waitfor15() {
	try {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	} catch (Exception e) {
		
	}
	}
	
	//explicit wait
	public static void elementwait(WebElement element) {
	try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(element));
	} catch (Exception e) {
		
	}
			
	}
	
	//sendkeys
	public static void send(WebElement element , String data) {
	try {
		element.sendKeys(data);
	} catch (Exception e) {
	}
		
	}
	
	//click
	public static void clickit(WebElement element) {
	try {
		element.click();
	} catch (Exception e) {
	}
	}
	
	//screenshot
	public static void screenshot() throws IOException {
	try {
		TakesScreenshot tk = (TakesScreenshot) driver ;
		File source = tk.getScreenshotAs(OutputType.FILE);

			File destination = new File ("C:\\Users\\user\\eclipse-workspace\\Miniprojthree\\Screenshot\\facBk.png");
			FileUtils.copyFile(source, destination);
	} catch (WebDriverException e) {
	}
		
	}

}
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

