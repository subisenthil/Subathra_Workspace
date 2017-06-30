package com.fannie.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
		
@Given("^Browser is open$")
public void browser_is_open(){
    // Write code here that turns the phrase above into concrete actions
 System.out.println("Launching Browser");
}
 
@When("^username and password is entered$")
public void username_and_password_is_entered(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actiion

  System.out.println("Username, Password and Designation"); 
  
  List<Map<String,String>> dataList = dataTable.asMaps(String.class, String.class);
  for (Map<String,String> temp: dataList){
  
  System.out.println("Username: "+ temp.get("username"));
  System.out.println("Password: "+ temp.get("password"));
  System.out.println("Designation: "+ temp.get("designation"));
  
}
}

@When("^Click on Submit$")
public void click_on_Submit() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Submit");
}

@Then("^Validate the User details$")
public void validate_the_User_details()  {
    // Write code here that turns the phrase above into concrete actions
  System.out.println("Validate User details"); 
}

}
