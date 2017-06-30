package Class_Assignments;

public class Bus extends Vehicle implements Vehicle_Interface {
	public Bus() {
		System.out.println("This is from Bus constructor");
	}

	@Override
	public void getVehicleTyp() {
		System.out.println("This Vehicle is Bus...");

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
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void FuelCapacity() {
System.out.println("Bus has less Fuel capacity than Truck and more capacity than Car");
		
	}

	@Override
	public void LoadCapacity() {
	System.out.println("Bus can carry more people than Car and Truck");
		
	}

}
