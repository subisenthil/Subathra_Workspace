package com.fannie.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicEx1 {
	
	
	public static void main(String[] args) {
		String baseUrl = "http://google.com";
		WebDriver driver;
//			
//		//Load the driver ;
//		//Step1: 
//		//this steps loads the chrome driver
//		System .setProperty("webdriver.chrome.driver", "C:\\softwares\\Selenium Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
		System.setProperty ("webdriver.gecko.driver","C:\\softwares\\Selenium Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//open the browser or connection
		//Step2
		driver.get(baseUrl);
		
		//do processing
		//Step3:
		System.out.println("Title - >"+driver.getTitle());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//close
		//Step4
		driver.close();
			}

}
