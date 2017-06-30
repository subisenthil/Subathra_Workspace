package com.fanniemae.Practice;

public class Bike extends Vehicle {
	public Bike() {

		System.out.println("This is fro Bike constructor");
	}

	public void kickStart() {
		System.out.println("Bikes comeswith kick start");
	}

	public void fuelCapacity() {
		System.out.println("Bikes has fuel capacity");
	}
	@Override
	public void move() {
		System.out.println("Bike moves with 2 wheels");
	}
	@Override
	public void carryPassenger() {
		System.out.println("Bike can carry 2 people");
	}

}
