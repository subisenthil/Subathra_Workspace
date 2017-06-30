package com.fannie.beans;

import java.io.Serializable;

public class Emp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8418816393415621172L;

	private int empId;
	
	private String empName;
	private int mycount;
	private static int count;
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Emp.count = count;
	}
	public int getMycount() {
		return mycount;
	}
	public void setMycount(int mycount) {
		this.mycount = mycount;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", mycount=" + mycount + "]";
	}
	
	
}
