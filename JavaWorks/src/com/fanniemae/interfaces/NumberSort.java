package com.fanniemae.interfaces;

import java.util.Arrays;

public class NumberSort {

	public static void main(String[] args) {
		int [] nums = {23,45,67,34,79,00};
		
	 for (int temp : nums){
		 System.out.println(temp);
	 }
	System.out.println("___________");
	Arrays.sort(nums);
	for (int temp : nums){
		 System.out.println(temp);
	
	}
}
}