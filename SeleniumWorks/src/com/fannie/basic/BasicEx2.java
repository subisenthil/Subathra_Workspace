package com.fannie.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fannie.util.DriverFactory;
import com.fannie.util.DriverNames;

public class BasicEx2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		String baseUrl = "http://naveenks.com/selenium/LoginForm.html";
	   //processing
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.findElement(By.id("uname")).sendKeys("hello@hello.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pwd")).sendKeys("secret@123");
		Thread.sleep(2000);
		driver.findElement(By.id("submitBtn")).click();
		
		Thread.sleep(2000);
	
		//System.out.println("Title - >"+driver.getTitle());
		driver.close();
		
	}

}
