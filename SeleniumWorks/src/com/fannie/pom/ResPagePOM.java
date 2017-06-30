package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResPagePOM {
	
	private static WebElement element;
	
	public static void enterUsername(String username, WebDriver driver){
		element = driver.findElement(By.id("uname"));
		element.clear();
		element.sendKeys(username);
        }

	public static void password(String password, WebDriver driver){
		element = driver.findElement(By.id("pwd"));
		element.clear();
		element.sendKeys(password);
        }
	
	public static void submit(String loginbtn, WebDriver driver){
		element = driver.findElement(By.id("submitBtn"));
		element.clear();
		element.sendKeys(loginbtn);
        }
}
