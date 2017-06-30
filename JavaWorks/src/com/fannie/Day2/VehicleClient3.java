package com.fannie.Day2;

public class VehicleClient3 {
	public static void main(String[] args) {
		
		Vehicle [] vehicles = new Vehicle[4];
		vehicles[0] = new Car();
		vehicles[1] = new Bike();
		vehicles[2] = new Truck();
		vehicles[3] = new Car();
		
		VehicleBL bl = new VehicleBL();
		bl.showVehicle(vehicles);
	}

}
