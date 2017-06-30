package com.fannie.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Dummy");
		list.add("Vinay");
		list.add("Senthil");
		
		System.out.println(list);
		System.out.println("Number Of Elements" + list.size());
		list.add(2,"Amma");
		System.out.println(list);
		//list.add(0,"Dummy");
		//System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		list.add("Subathra1");
		list.add("Subathra2");
		list.add("Subathra3");
		list.add("Subathra4");
		
			List<String> newList = list.subList(0, list.size());
			System.out.println("New List -->" +newList);
		

/*		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("Element Values :" + itr.next());

		}
		for (Object temp : list) {
			System.out.println(temp);

		}
	}*/
}
}

	