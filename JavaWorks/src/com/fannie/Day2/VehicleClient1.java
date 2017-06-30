package com.fannie.Day2;
//The super class can alwsted.pe cao be tays refrence to sub class
//vice versa is false it has t

public class VehicleClient1 {
public static void main(String [] args){
		Vehicle v; //v is called reference
		 v = new Car(); //v is called instance 
		//this object v is called Polymorphic 
		v.move();
		v.carryPassenger();
		
		((Car)v).Steering(); //Type casting
		((Car)v).tankCapacity();
	// this type casting cannot interchnaged exmple we cannot use this with Bike
		System.out.println("__________");
		
		v = new Bike();
		v.move();
		v.carryPassenger();
		((Bike)v).fuelCapacity();
		((Bike)v).kickStart();
}

}
