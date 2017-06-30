package com.fannie.Day2;

/*public class Vehicle {
	
	public void move() {
	System.out.println("Vehicle Moves...");
    }
	public void carryPassenger() {
	System.out.println("Vehicle carries passenger...");
    }
	public void tankCapacity() {
		// TODO Auto-generated method stub
	}
}*/

public abstract class Vehicle{
	int speed;
	public Vehicle(){
		super();
		System.out.println("Vehicle is being "
				+ " Manufactured");
	}
		public abstract void move();
		public abstract void carryPassenger();
		public abstract void accelerate();
		public abstract void brake();
		public void tankCapacity() {
			// TODO Auto-generated method stub
			
		}
		
}

