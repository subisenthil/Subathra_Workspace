package com.fannie.Day2;

public class Bike extends Vehicle{
	
	public Bike(){
		System.out.println("We are contructing Bike");
	}
	
	public void kickStart(){
	System.out.println(" Bikes comes with kick start...");
    }
	public void fuelCapacity(){
	System.out.println("All bikes have fuel capacity   ...");
	}
	//the child has overridden the parent
	@Override
	public void move(){
    System.out.println("Bike Moves with 2 wheels");
	}
	@Override
    public void carryPassenger(){
    	System.out.println("Bike carry passenger   ...");	
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
