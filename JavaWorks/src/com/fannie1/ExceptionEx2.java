package com.fannie1;

public class ExceptionEx2 {

	public static void checkName(String name) {
		if (name.length() < 5) {
			throw new RuntimeException("Sorry name is too small to process");
		}
	}

	public static void checkCreditScore(int creditScore, String name)
			throws Exception, FannieException, RuntimeException {
		try {
			checkName(name);
		} catch (RuntimeException re) {
			throw new RuntimeException("Sorry  Loan processig is not done because", re);

		}
		if (creditScore < 400) {
			// throw an exception and say loan cannot be processed
			throw new FannieException("Sorry Loan cannot be processed");
			//throw new FannieException();
			// runtime exception falls under unchecked.
		} else if (creditScore >= 400 && creditScore < 600) {
			// throw an exception and say lets wait for 3 months
			throw new RuntimeException("Lets check back in 3 month Mrs/Mrs:" + name);
		} else {
			System.out.println("Loan approved fro Ms/Mrs " + name);
		}
	}

	public static void main(String[] args) {

		try {
			checkCreditScore(200, "Teyrtyj");
		} catch (FannieException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
