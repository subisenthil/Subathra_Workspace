package com.fanniemae.interfaces;

public class MortgageLoan  extends BankLoan implements Income{
	
	private int loanAmount;
	private  int creditScore;
	private  int income;
	
 public MortgageLoan(int loanAmount, int creditScore,int income){
	 this.loanAmount = loanAmount;
	 this.creditScore = creditScore;
	 this.income = income;
 }
	
	@Override
	public void checkCreditScore() {
		// TODO Auto-generated method stub
		if (this.creditScore < 400){
			System.out.println("Sorry loans cannot be approved");
		}else{
			System.out.println("Loan is approved");
		}
	 
	}

	@Override
	public void verifyIncome() {
		// TODO Auto-generated method stub
		
	System.out.println("User Icome is " + income);
	System.out.println(income < 5000 ? "Sorry Less Income" : "You have good Income");
	
	}

	@Override
	public void loanAmount() {
		// TODO Auto-generated method stub
		
		System.out.println("UserLoan applied for loan amount " + loanAmount);
		
	}

	@Override
	public void repay(int repayAmount) {
		// TODO Auto-generated method stub
		loanAmount = loanAmount - repayAmount;
		System.out.println("Loan amount repaid is" + repayAmount);
		
	}

	@Override
	public void foreclosure() {
		// TODO Auto-generated method stub
		System.out.println("Customer wants to do fore closure for amt " + this.loanAmount);
		
	}

	@Override
	public void loanAmount(int amount) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
