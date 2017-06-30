package com.fanniemae.Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Synonym_Dictnry {
	public static void main(String[] args) throws Exception {

		// printHashMap(map);
		/*
		 * map.put("Hi", new String[] {"HI","Hello","Hola"}); map.put("GM", new
		 * String[] {"Gmorning","GoodMorning","Vannakam"}); map.put("Thank", new
		 * String[] {"Nandri","Nanni","Gracias"});
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Option A (Show Synonym) or B (Add synonym");
		String ans = br.readLine();
		if (ans != null && ans.equals("a")) {
			System.out.println("Show Synonym");
			System.out.println("Enter a Word");
			String word = br.readLine();
			if (word != null)
				showSynonym(word);

		} else if (ans != null && ans.equals("b")) {
			System.out.println("Add synonym");
		} else {
			System.out.println("Enter a Option A (Show Synonym) or B (Add synonym");
		}

		System.err.println(ans);

	}

	public static Map<String, String[]> readSynonym() throws Exception {

		Map<String, String[]> map = new HashMap<String, String[]>();

		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Huser\\workspace\\JavaWorks\\synonym.txt"));

		String line = "";
		while ((line = in.readLine()) != null) {

			String parts[] = line.split("\t");
			String[] strArray = new String[20];
			if (parts[1] != null) {
				strArray = parts[1].split(",");
			}
			map.put(parts[0], strArray);
		}

		return map;
	}

	public static void printHashMap(Map<String, String[]> map) {

		Iterator<Entry<String, String[]>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {

			Map.Entry<String, String[]> temp = (Entry<String, String[]>) itr.next();
			// if (word.equals(temp.getKey())){
			String[] strs = temp.getValue();
			for (String t : strs) {
				System.out.println(t);
			}
			// }
		}
	}

	public static void showSynonym(String word) throws Exception {
		Map<String, String[]> map = new HashMap<String, String[]>();
		map = readSynonym();

		Iterator<Entry<String, String[]>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {

			Map.Entry<String, String[]> temp = (Entry<String, String[]>) itr.next();
			if (word.equals(temp.getKey())) {
				String[] strs = temp.getValue();
				for (String t : strs) {
					System.out.println(t);
				}
				break;
			} else {
				System.out.println("Word Not found");
			}
		}
		// return null;
	}

}
