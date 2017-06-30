package Class_Assignments;

public class Car extends Vehicle implements Vehicle_Interface {
	
	public Car(){
		System.out.println("This is from Car Constructor");
	}
	
	
	@Override
	public void getVehicleTyp() {
	System.out.println("This Vehicle is Car....");
		
	}


	@Override
	public int getWheelNum() {
		// TODO Auto-generated method stub
		return super.getWheelNum();
	}

	@Override
	public void setWheelNum(int wheelNum) {
		// TODO Auto-generated method stub
		super.setWheelNum(wheelNum);
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return super.getModelName();
	}

	@Override
	public void setModelName(String modelName) {
		// TODO Auto-generated method stub
		super.setModelName(modelName);
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}


	@Override
	public void FuelCapacity() {
    System.out.println("Car is having less fuel capacity than Bus and Truck");
	}


	@Override
	public void LoadCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Car is having less loan capacity than Bus and Truck ");
		
	}


	
}
