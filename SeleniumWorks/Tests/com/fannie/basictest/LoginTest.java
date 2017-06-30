package com.fannie.basictest;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fannie.util.DriverFactory;
import com.fannie.util.DriverNames;



@RunWith(Parameterized.class)
public class LoginTest {
	
	String baseUrl;
	WebDriver driver;
	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new String[][]{
			{"Subi@hello.com","subi123"},
			{"Subi1@hello.com","subi1234"},
			{"Subi2@hello.com","subi1235"}
			
			});

	}
	private String uName;
	private String pwd;
	
	
	public LoginTest(String uName,String pwd){
		this.uName = uName;
		this.pwd = pwd;
	}
	
	@Before
	public void setUp() throws Exception {
		
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		baseUrl = "http://naveenks.com/selenium/LoginForm.html";
	   //processing
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void test() throws Exception {
		
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.findElement(By.id("uname")).sendKeys(this.uName);
		Thread.sleep(2000);
		driver.findElement(By.id("pwd")).sendKeys(this.pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("submitBtn")).click();
	
	}

}
