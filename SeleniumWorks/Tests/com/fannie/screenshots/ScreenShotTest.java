package com.fannie.screenshots;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fannie.generics.GenericMethods;
import com.fannie.util.DriverFactory;
import com.fannie.util.DriverNames;
import com.fannie.util.ElementType;
import com.fannie.util.ScreenShot;

public class ScreenShotTest {
	
	WebDriver driver ; 
	String baseURL;
	GenericMethods genMethods;
	ScreenShot screenShot;
		
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	    // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driver.manage().window().maximize();

		baseURL = "https://www.expedia.com/";
	    genMethods  = new GenericMethods(driver);
	    screenShot = new ScreenShot(driver);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		
		screenShot.takeScreenShot();
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	@Ignore
	@Test
	public void test() {
	
		
		String userName = "ctl00_MPH_txtUserName";
		genMethods.getElement(userName, ElementType.ID).sendKeys("cohort413@sdettraining.com");
		
		String password = "ctl00_MPH_txtPassword";
		genMethods.getElement(password, ElementType.ID).sendKeys("Hexaware04!");
		
		String subBtn = "btnLogin";
		genMethods.getElement(subBtn, ElementType.ID).click();
		
		
		//refer to content iframe
		
		driver.switchTo().frame("ctl00_Split_Frame_ContentFrame");
		
		WebElement  lblCalendar = genMethods.getElement("ctl00_MPH_calendarToday__Label",ElementType.ID);
	    System.out.println("Coming from server " + lblCalendar.getText());
		
	    
	    
		Assert.assertEquals("Testing for Calendar Element", 
			"Calenr", lblCalendar.getText());
				
				
	}

	@Test
	public  void ScreenShotTest() throws Exception{
		String input = "New York, NY (NYC - All Airports)";
		genMethods.getElement("tab-flight-tab-hp", ElementType.ID).click();
		genMethods.getElement("flight-origin-hp-flight", ElementType.ID).sendKeys(input);
		screenShot.takeScreenShot();
		Thread.sleep(2000);
		genMethods.getElement("flight-destination-hp-flight", ElementType.ID).sendKeys(input);
		Thread.sleep(1000);
		screenShot.takeScreenShot();
		genMethods.getElement(".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button", ElementType.XPATH).click();
		
		
	
	}
}
