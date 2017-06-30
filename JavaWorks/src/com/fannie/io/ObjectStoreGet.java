package com.fannie.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStoreGet {

	//write the object
	
	public static void saveCustomer(Customer customer)
	 throws FileNotFoundException,IOException
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cutomer.ser"));
		oos.writeObject(customer);
		System.out.println("Customer Saved...");
	}
		//read the object	
	public static void readCustomer()
			 throws FileNotFoundException,IOException, ClassNotFoundException
			{
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cutomer.ser"));
				 Customer cust = (Customer) ois.readObject();//Type casting
				System.out.println(cust);
			}
		
	public static void main(String[] args) {
		Customer customer = new Customer(101,"VinaySegan");
	
		
				try {
					saveCustomer(customer);
					readCustomer();
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
	

