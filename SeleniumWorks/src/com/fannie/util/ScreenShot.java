package com.fannie.util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.intl.DateTimeFormat;

public class ScreenShot {
	
	private WebDriver driver;
	
	public ScreenShot(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void takeScreenShot(String fileName){
		
		String path = "C:\\Users\\Huser\\Desktop\\Selenium Images\\";
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(file,new File(path +fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void takeScreenShot(){
		
		String path = "C:\\Users\\Huser\\Desktop\\Selenium Images\\";
		Date date  = new Date();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Calendar gc = GregorianCalendar.getInstance();
		
		 try {
			 //File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			 String fileName = gc.get(Calendar.DATE)+"-"+gc.get(Calendar.MINUTE)+"-"+gc.get(Calendar.SECOND)+".png";
			 
				FileUtils.copyFile(file,new File(path +fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
