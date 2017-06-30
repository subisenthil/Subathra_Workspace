	package com.fannie.dao;
	
	import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
	
	import com.fannie.connection.GetConnection;
	import com.fannie.contracts.IEmpDao;
	import com.fanniemae.beans.Emp;
	
	public class EmpDAO implements IEmpDao {
	
		@Override
		public void insertEmp(Emp emp) {
			// TODO Auto-generated method stub
			// Array index starts from zero
			// Iterator starts from -1
			// Prepared statements index from 1
	
			String sql = "update emp set where empsal = ?and empid = ? ";
			GetConnection gc = new GetConnection(); // will create ps and rs and it
													// will create connection
			try {
				gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
				gc.ps.setInt(1, emp.getEmpId());
				gc.ps.setString(2, emp.getEmpName());
				gc.ps.setDouble(3, emp.getEmpSal());
				gc.ps.setString(4, emp.getEmpEmail());
	
				boolean flag = gc.ps.executeUpdate() > 0;
	
				if (flag) {
					System.out.println("Record Inserted");
				} else {
					System.out.println("Recods not Insert");
				}
	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		@Override
		public void updatEmp(int empId, double empSal) {
		String sql = "Update emp set empsal = ? where empid = ?";
		GetConnection  gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setDouble(1,empSal);
			gc.ps.setInt(2,empId);
			
			System.out.println(gc.ps.executeUpdate()> 0? "Updated":"Not Updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	
		@Override
		public void deleteEmp(int empId) {
			// TODO Auto-generated method stub
			String sql = "delete from emp where empid = ?";
			GetConnection  gc = new GetConnection();
			try {
				gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
				gc.ps.setInt(1,empId);
				System.out.println(gc.ps.executeUpdate()> 0? "Deleted":"Not Deleted");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
		@Override
		public Emp getEmp(int empId) {
			// TODO Auto-generated method stub
			String sql = "select empid,empname,empsal,email from  emp empid = ?";
			GetConnection gc = new GetConnection();
			try {
				gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
				gc.ps.setInt(1, empId);
				gc.rs = gc.ps.executeQuery();
				 
				if (gc.rs.next()){
					Emp temp = new Emp();
					temp.setEmpId(gc.rs.getInt(1));
					temp.setEmpName(gc.rs.getString(2));
					temp.setEmpSal(gc.rs.getDouble(3));
					temp.setEmpEmail(gc.rs.getString(4));
					return temp;
				
				}else {
					System.out.println("Sorry No records exsists");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
				}
	
		@Override
		public List<Emp> getAllEmps() {

			String sql="select * from emp";

			GetConnection gc = new GetConnection();
			ArrayList<Emp> list = new ArrayList<Emp>();
			
			try {
				gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
				gc.rs = gc.ps.executeQuery();
				
				// since there may be one record we use loop 
				while(gc.rs.next()){
					Emp temp = new Emp();
					temp.setEmpId(gc.rs.getInt(1));
					temp.setEmpName(gc.rs.getString(2));
					temp.setEmpSal(gc.rs.getDouble(3));
					temp.setEmpEmail(gc.rs.getString(4));
					
					list.add(temp);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
			
		}
	}

