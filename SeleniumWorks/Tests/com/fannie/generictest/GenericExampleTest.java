package com.fannie.generictest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fannie.generics.GenericMethods;
import com.fannie.util.DriverFactory;
import com.fannie.util.DriverNames;
import com.fannie.util.ElementType;

public class GenericExampleTest {
	
	WebDriver driver ; 
	String baseURL;
	GenericMethods genMethods;
	
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driver.manage().window().maximize();
	    genMethods  = new GenericMethods(driver);
		baseURL = "http://webmail.sdettraining.com/Login.aspx";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
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

}
