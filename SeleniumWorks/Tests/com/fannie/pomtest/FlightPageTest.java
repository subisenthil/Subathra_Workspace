package com.fannie.pomtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fannie.generics.GenericMethods;
import com.fannie.pom.FlightPageFactory;
import com.fannie.util.DriverFactory;
import com.fannie.util.DriverNames;
import com.fannie.util.ScreenShot;

public class FlightPageTest {

	WebDriver driver;
	String baseURL;
	GenericMethods genMethods;
	ScreenShot screenShot;
	FlightPageFactory flightPage;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.manage().window().maximize();

		baseURL = "https://www.expedia.com/";
		screenShot = new ScreenShot(driver);
		flightPage = new FlightPageFactory(driver);
		driver.get(baseURL);

	}

	@After
	public void tearDown() throws Exception {

		screenShot.takeScreenShot();
		Thread.sleep(3000);
		// driver.quit();
	}
	// @Ignore
	// @Test
	// public void test() throws Exception {
	// FlightPagePOM.clickFlightTab(driver);
	// FlightPagePOM.sendFlyFromTextBox("Washington, DC (IAD-Washington Dulles
	// Intl.)", driver);
	// FlightPagePOM.sendFlyToTextBox("New York, NY (JFK-John F. Kennedy
	// Intl.)", driver);
	// FlightPagePOM.sendDepatureDate("28", driver);
	// FlightPagePOM.sendReturnDate("04", driver);
	//
	// }

	@Test
	public void test() throws Exception {
		flightPage.clickFlightTab();
		flightPage.sendFlyFrom("Washington, DC (IAD-Washington Dulles Intl.)");
		flightPage.sendFlyTo("New York, NY (JFK-John F. Kennedy Intl.)");

	}
}
