package com.fannie.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoanSancationStep {
	
	@Given("documents and submitted")
	public void documents_and_submitted() {
		System.out.println("Documents and submitted");
		System.out.println("___________________________");
	}
	
	@Given("the customer works \"([A-Za-z]{1,})\" time")
	public void the_customer_works_full_time(String workTime) {
		System.out.println("the customer works"+ workTime + "time");
	}

	@And("working in \"([A-Za-z]{1,})\" office")
	public void working_in_govt_office(String workType) {
		System.out.println("working in"+workType+"office");
	}

	@When("credit score is more than \"(\\d+)\"$")
	public void credit_score_is_more_than_500(int crdtscr) {
		System.out.println("credit score is more than " +crdtscr+"$");
	}
	
	@Then("Sanction loan")
	public void Sanction_loan() {
		System.out.println("Sanction loan");
	}

@But("customer has to repay with in \"(\\d+)\" years")
public void customer_has_to_repay_with_in_20_years(int years){
	System.out.println("But customer has to repay with in"+years+"years");
}




}
