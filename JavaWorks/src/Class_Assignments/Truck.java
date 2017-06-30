package Class_Assignments;

public class Truck  extends Vehicle{
	public Truck(){
		System.out.println("This is from Truck constructor");
	}
	
	@Override
	public void getVehicleTyp() {
		System.out.println("This vehicle is truck.....");
		
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



}
