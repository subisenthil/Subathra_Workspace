package com.fannie.actions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fannie.generics.GenericMethods;
import com.fannie.util.DriverFactory;
import com.fannie.util.DriverNames;
import com.fannie.util.ElementType;
import com.fannie.util.ScreenShot;

public class DragDropTest1 {
	
	WebDriver driver ; 
	String baseURL;
	GenericMethods genMethods;
	ScreenShot screenShot;
		
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	    // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driver.manage().window().maximize();

		baseURL = "https://www.w3schools.com/html/html5_draganddrop.asp";
	    genMethods  = new GenericMethods(driver);
	    screenShot = new ScreenShot(driver);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		
		screenShot.takeScreenShot();
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void test() throws Exception {
		
		String Source = div1;
		String Target = div2;
		
				
		String menuXpath ="//*[@id='menu_category_Menu_VIfWm2LT_332']/a/span/span";
		String submenuXpath = "//*[@id='menu_category_Menu_VIfWm2LT_332']/div/div/div[1]/div/ul/li[3]/a/span";
		WebElement menuElement = genMethods.getElement(menuXpath, ElementType.XPATH);
		
		Actions action = new Actions(driver);		
		action.dragAndDrop(source, target)
		Thread.sleep(1000);
		WebElement subMenuElement = genMethods.getElement(submenuXpath, ElementType.XPATH);
		//action.click(subMenuElement).perform();
		subMenuElement.click();
			
	}
}
