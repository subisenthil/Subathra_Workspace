package com.fannie;

import java.util.Date;

public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		// TODO Auto-generated method stub
		return  "Today's dte is :" +new Date().toString();
	}

	@Override
	public String getServerName(String name) {
		// TODO Auto-generated method stub
		return  "Server FannieMae Says Hi to "+name;
	}

	@Override
	public String getCompanyName() {
		// TODO Auto-generated method stub
		return "Company Nae FannieMae";
	}

	@Override
	public String checkCreditScore(String custName, int creditScore) {
		// TODO Auto-generated method stub
		if(creditScore<400){
			return "Sorry Loan cannot be sanctioned Mr/Mrs"+creditScore;
			}else if (creditScore >= 400 && creditScore){
				return "We are worki gon your profile, Mr/Mrs/Ms" +creditScore;
			}else {
				return "Loan Approved "+cusName;
			}
		
	}
	
	

}
