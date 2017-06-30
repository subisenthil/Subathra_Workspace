package com.fannie.client;


import java.util.List;

import com.fannie.contracts.IEmpDao;
import com.fannie.dao.EmpDAO;
import com.fanniemae.beans.Emp;

public class EmpClient {
	
	public static void main(String[] args) {
		Emp emp = new Emp(102,"Subathra",25000,"subifanniemae.com");
		
		IEmpDao dao = new EmpDAO();
		//dao.insertEmp(emp);
		//dao.updatEmp(102,400000);
		dao.deleteEmp(101);
		
		
		//Emp emp1 = dao.getEmp(10);
		//System.out.println(emp1);
		
		
		
		List<Emp> list = dao.getAllEmps();
		for(Emp temp : list){
			System.out.println(temp);
		}
		
	}

}
