package com.fanniemae.interfaces;

public class LoanImpl {
	
	public static void main(String[] args) {
		MortgageLoan mlHarry = new MortgageLoan(60000,456,7000);//Anything we have one time is in the constructor
		mlHarry.checkCreditScore();
		mlHarry.verifyIncome();
		mlHarry.loanAmount();
		mlHarry.repay(2000);
		mlHarry.foreclosure();
		mlHarry.repay(8000);
		mlHarry.loanAmount();
		
	}

}
