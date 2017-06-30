package com.fannie.step;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GenericStep {
	
	@Before
	public  void userHasToReg() {
		System.out.println("%%%%%%%%%%% User Has to Register %%%%%%%%%%%%");
		
	}
	
	@After
	public  void AfterTheProcess() {
		System.out.println("%%%%%%%%%%% This is after the process %%%%%%%%%%%%");
		
	}
	
	
	
	
	

}
