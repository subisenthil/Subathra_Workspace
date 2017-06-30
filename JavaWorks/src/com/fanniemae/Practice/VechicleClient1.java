package com.fanniemae.Practice;

public class VechicleClient1 {
	
	public static void main(String[] args) {
		
		//Vehicle v = new Car(); one way of doing
		//or the below met
		Vehicle v;
		//the object v is called polymorpic
		// this object V used to instantiate Car and Bike.
		v = new Car();
		v.move();
		v.carryPassenger();
		((Car)v).Steering(); //type casting..
		((Car)v).tankCapacity();
		
		System.out.println("*******************************");
		
		v = new Bike();
		v.carryPassenger();
		v.move();
		((Bike)v).kickStart();; //type casting..
		((Bike)v).fuelCapacity();;
	}

}
