package com.fannie.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPageFactory {

	private WebDriver driver;
	
	public FlightPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); //here "this" meaning current class
	}
	@FindBy(id = "tab-flight-tab-hp")
	WebElement flighttab;
	
	@FindBy(id = "flight-origin-hp-flight")
	WebElement flyFrom;
	
	@FindBy(id = "flight-destination-hp-flight")
	WebElement flyTo;
	
	public void clickFlightTab(){
		this.flighttab.click();
	}
	
	public void  sendFlyFrom(String flyFrom){
		this.flyFrom.clear();
		this.flyFrom.sendKeys(flyFrom);
	}
	public void sendFlyTo(String flyTo){
		this.flyTo.click();
	
}
}
