package com.fannie.collections;

import java.util.HashSet;

public class SetEx1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
 set.add("Name001");
 set.add("Name001.5");
 System.out.println(set.add("Name002"));
 System.out.println(set.add("Name002"));
 set.add("Name002");
 set.add("Name002");
 set.add("Name002");
 set.add("Name002");
 
 set.remove("Name004");
 System.out.println(set);
}
}