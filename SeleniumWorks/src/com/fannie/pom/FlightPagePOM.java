package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightPagePOM {

	private static WebElement element;
	
	public static void clickFlightTab(WebDriver driver){
		driver.findElement(By.id("tab-flight-tab-hp")).click();
	}
	
	public static void sendFlyFromTextBox(String flyFrom, WebDriver driver){
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		element.clear();
		element.sendKeys(flyFrom);
	}
	
	
	public static void sendFlyToTextBox(String flyTo, WebDriver driver){
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		element.clear();
		element.sendKeys(flyTo);
	}
	public static void sendDepatureDate(String dDate, WebDriver driver) throws Exception{
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		element.clear();
		element.sendKeys(dDate);
		Thread.sleep(2000);
		 String selectDateXpath=".//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[text()="+dDate+"]";
		 driver.findElement(By.xpath(selectDateXpath)).click();
		
	}
		
	public static void sendReturnDate(String RDate, WebDriver driver){
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		element.clear();
		element.sendKeys(RDate);
		 String selectDateXpath=".//*[@id='flight-returning-wrapper-hp-flight']/div/div/div[3]/table/tbody/tr/td/button[text()="+RDate+"]";
		 driver.findElement(By.xpath(selectDateXpath)).click();
		
	}
	
	
	
	}
