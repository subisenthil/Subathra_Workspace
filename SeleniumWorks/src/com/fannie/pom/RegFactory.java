package com.fannie.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegFactory {
	
	private WebDriver driver;
	public RegFactory(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this); //here "this" meaning current class
	}
	@FindBy(id = "uname")
	WebElement username;
	
	@FindBy(id = "pwd")
	WebElement pwd;
	
	@FindBy(id = "submitBtn")
	WebElement loginbtn;
	
	public void enterUsername(String username){
		this.username.sendKeys(username);
		
	}
	
	public void password(String pwd){
		this.username.sendKeys(pwd);
	}
	public void submit(){
		this.loginbtn.click();
	
}
}

