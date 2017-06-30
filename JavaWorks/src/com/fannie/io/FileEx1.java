package com.fannie.io;

import java.io.File;
// auto import cntrl+shft+o 
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) {
			File f = new File ("emp.txt");
//			try {
//				boolean flag = f.createNewFile();
//				System.out.println(flag?"File created":"File no created");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		System.out.println(f.getAbsolutePath());
		System.out.println("is readable"+f.canRead());
		System.out.println("is writable" +f.canWrite());
		System.out.println("isFile" + f.isFile());
	}

	
}
