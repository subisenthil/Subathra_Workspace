package com.fannie.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Subathra", 2200);
		map.put("Senthil", 2400);
		map.put("Vinay", 3300);
		map.put("Segan", 4400);
		/*System.out.println("Subathra Balance --->" +map.get("Subathra"));
		
		map.put("Subathra", 3000);
		System.out.println("Subathra Balance --->" +map.get("Subathra"));
		
		System.out.println("Segan Balance --->" +map.get("Segan"));*/
				
		Set mySet = map.entrySet();
		
		Iterator itr = mySet.iterator();
		while(itr.hasNext()){
			Map.Entry<String,Integer> temp = (Entry<String,Integer>)itr.next();
			System.out.println(temp.getKey() +"," +temp.getValue());
		}
	}

}
//Write a program 
/*Map<String,List<String>> map = new HashMap<String>
 
 */

