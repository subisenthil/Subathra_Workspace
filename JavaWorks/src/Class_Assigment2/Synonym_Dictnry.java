package Class_Assigment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Synonym_Dictnry {
	public static void main(String[] args) throws IOException {
		
		Map<String,String[]> map =new HashMap<String,String[]>();
		map.put("Hi", new String[] {"HI","Hello","Hola"});
		map.put("GM", new String[] {"Gmorning","GoodMorning","Vannakam"});
		map.put("Thank", new String[] {"Nandri","Nanni","Gracias"});
	BufferedWriter bw = null;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Word");
	String word = br.readLine();
	
	File f = new File("Emp1.txt");

	
	Iterator<Entry<String, String[]>> itr = map.entrySet().iterator();
	while(itr.hasNext()){
		
		Map.Entry<String, String[]>temp = (Entry<String,String[]>)itr.next();
		if (word.equals(temp.getKey())){
			String[] strs = temp.getValue();
			for(String t : strs){
				
				FileWriter fw = new FileWriter(f,true);//To append
				bw = new BufferedWriter(fw)	;	
				 //bw = new BufferedWriter(new FileWriter("Emp.txt"));
				bw.write(strs);
				bw.newLine();
				System.out.println(t);
			}
		}
	}
	
		
	}

}
