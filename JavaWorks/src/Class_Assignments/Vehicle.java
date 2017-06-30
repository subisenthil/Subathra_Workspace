package Class_Assignments;

public abstract class Vehicle {
	int wheelNum;
	String modelName;
	String color;
	
	public Vehicle(){
		System.out.println("This is from Vehicle default constructor");}
	public abstract void getVehicleTyp();

	public int getWheelNum() {
		return wheelNum;
	}

	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColor() {
		return color;

	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [wheelNum=" + wheelNum + ", modelName=" + modelName + ", color=" + color + "]";
	}
	
	
}
