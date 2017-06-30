package com.fannie.collections;

import java.util.LinkedList;
import java.util.Vector;

public class ListEx3 {

	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(5,2);
		
		System.out.println("Size"  +list.size());
		System.out.println("Capacity"  +list.capacity());
		list.add("Name1");
		list.add("Name2");
		list.add("Naem3");
		list.add("Name4");
		list.add("Name5");
		list.add("Name6");
		list.add("Name7");
		list.add("Name8");
		list.add("Name9");
		list.add("Name10");
		list.add("Name11");
	
		
		System.out.println("Size"  +list.size());
		System.out.println("Capacity"  +list.capacity());
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("Name01");
		list1.add("Name02");
		list1.add("Name03");
		
		System.out.println(list1);
		
		list1.addFirst("Name05");
		
		System.out.println(list1);
		//Try linked list methods
		//Stack methods
		// Queue is an interface
		
	}
}
