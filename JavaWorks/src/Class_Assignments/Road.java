package Class_Assignments;

public class Road {
	public static void main(String[] args) {
		//Vehicle v = new Car();
		Car v = new Car();
		v.getVehicleTyp();
		v.setModelName("Toyota");
		v.setWheelNum(4);
		v.setColor("Black");
        System.out.println(v);
        v.FuelCapacity();
        v.LoadCapacity();
        
        
        System.out.println("***************************************************");
    	Vehicle v1 = new Bus();
    	v1.getVehicleTyp();
		v1.setModelName("Mini");
		v1.setWheelNum(6);
		v1.setColor("Green");
        System.out.println(v1);
        
        System.out.println("***************************************************");
    	Vehicle v2 = new Truck();
    	v2.getVehicleTyp();
		v2.setModelName("School");
		v2.setWheelNum(8);
		v2.setColor("Yellow");
        System.out.println(v2);

	}
}
