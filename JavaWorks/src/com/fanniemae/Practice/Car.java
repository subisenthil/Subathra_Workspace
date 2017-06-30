package com.fanniemae.Practice;

public class Car  extends Vehicle{
	public Car(){
		
		System.out.println("HI..This is from constructor - CAR");
	}
	
	public void Steering(){
		System.out.println("All cars have steering");
	}
	public void tankCapacity(){
		System.out.println("All cars shall have fuel tank, with limit");
	}
@Override	
	public void move() {
		System.out.println("Car moves with 4 wheels");
	}
@Override
	public void carryPassenger() {
		System.out.println("Bike can carry 4 to 5 people");
	}
}