package com.fannie.contracts;

import java.util.List;

import com.fanniemae.beans.Emp;

public interface IEmpDao {

	// insert
	public void insertEmp(Emp emp);

	// Update
	public void updatEmp(int empId, double empSal);

	// delete

	public void deleteEmp(int empId);

	// select one
	public Emp getEmp(int empId);

	// select all
	public List<Emp> getAllEmps();

}
