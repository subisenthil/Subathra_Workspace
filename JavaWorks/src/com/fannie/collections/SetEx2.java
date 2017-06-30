package com.fannie.collections;

import java.util.HashSet;

public class SetEx2 {
	
	public static void main(String[] args) {
		
		HashSet<Park> parks = new HashSet<Park>();
		
		parks.add(new Park (101,"Outside park", "Herndon"));
		parks.add(new Park (733,"Frying park", "Herndon"));
		parks.add(new Park (101,"Old Ox park", "Herndon"));
		
		
		parks.add(new Park (101,"Old Ox park", "Herndon"));
		parks.add(new Park (101,"Old Ox park", "Herndon"));
		parks.add(new Park (101,"Old Ox park", "Herndon"));
		
		for(Park temp : parks){
			//System.out.println(temp);
			System.out.println(temp + "," +temp.hashCode());
		}
	}

}
