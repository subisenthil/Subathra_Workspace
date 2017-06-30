package com.fannie;

class Emp{
		  private int empId;
		  private   String empName;
		  private  double empSal;
		  public int getEmpId(){
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
		  public double getEmpSal() {
		 	return empSal;
		    }
		  public void setEmpSal(double empSal) {
			if (empSal<5000){
				            this.empSal = 5000;
				            System.out.println( "sorry salary cannot be more than 5000");	
			                }
			else {this.empSal = empSal;
		         }
		    }
		@Override
		public String toString() {
	    return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
		//avoided all printf functions
		}
		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			//super.finalize();get rid of this since it is super class finalize
			
		}
		
		}	 
		  
//setters 
		/*  public void setEmpId(int empId) {
		  //can i write any condition --No
			 this.empId = empId;
		  }
	   public int getEmpId(){
		   return this.empId;
	   }  
		  */
