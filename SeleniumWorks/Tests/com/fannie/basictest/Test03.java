package com.fannie.basictest;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.util.Driver;
import com.fannie.util.DriverFactory;
import com.fannie.util.DriverNames;



public class Test03 {

	WebDriver driver ; 
	String baseURL;

	@Before

	public void setUp() throws Exception {

		driver = DriverFactory.getDriver(DriverNames.CHROME);

	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver.manage().window().maximize();

		baseURL = "http://google.com";

		driver.get(baseURL);

	}



	@After

	public void tearDown() throws Exception {

		Thread.sleep(3000);

		driver.quit();

	}

	

	@Test

	public void test() {

		WebElement element1 = driver.findElement(By.id("gs_taif0"));

		System.out.println("Element1 Enables -> " +element1.isEnabled());

		element1.sendKeys("places to visit");
	

		

		// below code does not work since it is 

		// disabled 

		/*
		  WebElement element2 = driver.findElement(By.id("gs_taif0"));
		 
		System.out.println("Element 2 enabled -> " + element2.isEnabled());
		element2.sendKeys("places to visit");
		*/

		// try with this 

		// gs_htif0 (@ Your leisure) 

		

	}



}
