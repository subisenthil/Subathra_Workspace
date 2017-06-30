package com.fannie.Day2;

public class Car extends Vehicle {

	public Car() {
		// every constructor shall have the constructor word
		// if you don't have then constructor shall have one and if you have
		// super()
		// shall be the first constructor
		super();
		System.out.println("Hi We are contructing Car");
	}

	public void Steering() {
		System.out.println(" Car has steering...");
	}

	public void move() {
		System.out.println(" Car Moves...");
	}

	@Override
	public void tankCapacity() {
		System.out.println("All cars will have fuel capacity   ...");
	}

	@Override
	public void carryPassenger() {
		System.out.println("cars carry passenger   ...");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Speed increased (Car)" + (++speed));
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Speed decreased (Car)" + (--speed));
	}

}
