package com.fanniemae.Practice;

public class VehicleClient {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.move();
		c.Steering();
		c.carryPassenger();
		c.tankCapacity();
		
		System.out.println("***********************************");
		
		Bike b = new Bike();
		b.kickStart();
		b.fuelCapacity();
		b.carryPassenger();
		b.move();
	}
}
