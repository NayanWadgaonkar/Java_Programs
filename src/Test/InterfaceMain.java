package Test;
interface VehicleInterface{
	void VehicleStart();
	void VehicleStop();
	void VehicleRun();
}
class Car1 implements VehicleInterface{
	private int speed;
	private String ModelName;
	
	public Car1(int speed,String ModelName) {
		this.ModelName = ModelName;
		this.speed = speed;
	}

@Override
public void VehicleStart() {
	// TODO Auto-generated method stub
	System.out.println(ModelName+" starts the engine");
}

@Override
public void VehicleStop() {
	// TODO Auto-generated method stub
	System.out.println(ModelName+" stops the engine");
}

@Override
public void VehicleRun() {
	// TODO Auto-generated method stub
	System.out.println(ModelName+" is running at speed "+speed +" km/hr");
}
}
public class InterfaceMain{
	public static void main(String[]args) {
		Car1 car = new Car1(98,"BMW");
		car.VehicleStart();
		car.VehicleStop();
		car.VehicleRun();
	}
}