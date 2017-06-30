package com.fannie.basic;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fannie.util.DriverFactory;
import com.fannie.util.DriverNames;

public class DemoCartTest01 {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = "https://demostore.x-cart.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testIng1() throws Exception {
		// 1. TODO -> Load the page
		driver.get(baseUrl);

		// 2. TODO -> Find the shipping elememt  
		driver.findElement(By.linkText("Shipping")).click();
		Thread.sleep(2000);

		// 3. TODO -> find Contact us 
		driver.findElement(By.partialLinkText("Contact")).click();
		Thread.sleep(2000);
		
		// 4. TODO -> enter value for your name 
		driver.findElement(By.id("name")).sendKeys("Testing Name");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("testing@testing.com");
		Thread.sleep(2000);
		driver.findElement(By.id("subject")).sendKeys("This is Subject");
		Thread.sleep(2000);
		driver.findElement(By.id("message")).sendKeys("This is message");
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
