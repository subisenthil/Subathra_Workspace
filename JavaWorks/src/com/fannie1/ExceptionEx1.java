package com.fannie1;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			int num1 = 10;
			int num2 = 0;
			try {
				int num[] = new int[-4];
			} catch (NegativeArraySizeException nase) {
				System.out.println("You tried divide by zero: i am form bested exception");
			}
			int result = num1 / num2;
			System.out.println("Result is" + "  " + result);
		} catch (ArithmeticException ae) {
			System.out.println("You tried dividing by zero" + ae.getMessage());
		} catch (NegativeArraySizeException nase) {
			System.out.println("Hey dont create an arry with -ve");
		} catch (java.lang.Exception e) {
			System.out.println("Sorry something went wrong");
		} finally { // Finally should be always executed
			System.out.println("hey i am here finally");
		}
		System.out.println("This is some other business logic");

	}

}
