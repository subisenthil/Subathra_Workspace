    package com.fannie;

//client

public class EmpExample {
	public static void main(String [] args)
	{ 
		
		System.runFinalizersOnExit(true);
		//System.gc();
	  Emp e1 = new Emp(); //default constructor is give by complier
	  e1.setEmpId(101);
	  e1.setEmpName("Harry");
	  e1.setEmpSal(-120000);
	  Emp e2 = new Emp(); //default constructor is give by complier
	  e2.setEmpId(102);
	  e2.setEmpName("Peter");
	  e2.setEmpSal(-40000);
	  
	
	 /* System.out.println("Emp Id" + "=" +e1.getEmpId());
	  System.out.println("Emp Name" + "=" +e1.getEmpName());
	  System.out.println("Emp Salary" + "=" +e1.getEmpSal());	
	  
	//With New getter and setter the below will not work
	  e1.empId = 101;
	  e1.empName = "Harry";
	  e1.empSal = -120000.00;
	  
	  System.out.println("Emp Id" + "=" +e1.empId);
	  System.out.println("Emp Name" + "=" +e1.empName);
	  System.out.println("Emp Salary" + "=" +e1.empSal);*/
	  
	  System.out.println(e1);
	  System.out.println(e2);
	}

}
