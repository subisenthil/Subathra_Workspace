package com.fanniemae.Practice;

public class Exmpl_Naveen {

	
	


public void insertEmp(Employee emp) {

String sql = "Insert into employee values(?,?,?,?)";

GetConnection gc = new GetConnection();

try {

gc.ps=GetConnection.getMySqlConnection().prepareStatement(sql);

gc.ps.setInt(1, emp.getEmpId());

gc.ps.setString(2, emp.getEmpName());

gc.ps.setDouble(3,emp.getEmpSal());

gc.ps.setString(4, emp.getEmpEmail());

boolean flag = gc.ps.executeUpdate()>0;

 

if(flag){

System.out.println("Record inserted.");

}

else{

System.out.println("Sorry, record not inserted");

}

} catch (SQLException e) {

e.printStackTrace();

}

}

 

 
 
}
