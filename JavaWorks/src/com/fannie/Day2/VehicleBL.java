package com.fannie.Day2;

public class VehicleBL {
public void showVehicle(Vehicle[] vehicles){
	
	for(Vehicle temp: vehicles){
		System.out.println("____________");
		temp.carryPassenger();
		temp.move();
		
		if(temp instanceof Car){
			((Car) temp).Steering();
			((Car) temp).tankCapacity();
		     }else if (temp instanceof Bike){
			((Bike)temp).kickStart();
			((Bike) temp).fuelCapacity();
	
		    }
	     }
  }
}


