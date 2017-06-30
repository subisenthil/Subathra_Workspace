package com.fannie.Day2;

public class VehicleClient {
	public static void main(String [] args)
	{	Car c = new Car();
		c.Steering();
		c.carryPassenger();
		c.tankCapacity();
		c.move();
		
		System.out.println("__________");
		
		Bike b = new Bike();
	    b.kickStart();
		b.fuelCapacity();
		b.move();
		b.carryPassenger();
		
		
		System.out.println("__________");
		
		Truck t = new Truck();
		t.move();
		t.carryPassenger();
		
		  
		
	}
}
