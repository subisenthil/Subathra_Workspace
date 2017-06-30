package com.fannie.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWrite {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	//string and cannot be parsed
		BufferedWriter bw = null;
			
			try {
				System.out.println("Enter Employee Id");
				int empId = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Employee Name");
				String empName = br.readLine();
				
				System.out.println("Emp Id is" +empId);
				System.out.println("Emp Name is " +empName);
				//if there is no file exists it will create
				File f = new File("Emp.txt");
				FileWriter fw = new FileWriter(f,true);//To append
				bw = new BufferedWriter(fw)	;	
				 //bw = new BufferedWriter(new FileWriter("Emp.txt"));
				bw.write(empId +" "+ empName);
				bw.newLine();
											
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try{
					bw.close();
				}catch (IOException e){
				e.printStackTrace();
			}
			}
	}

}
