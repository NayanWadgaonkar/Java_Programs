package Test;
class Vehicle{
	String ModelName;
	int numberPlate;
	String colour;

public Vehicle(String ModelName,int numberPlate,String colour) {
	this.ModelName= ModelName;
	this.numberPlate= numberPlate;
	this.colour = colour;
}
public void VehicleInformation() {
	System.out.println(ModelName+" is the vehicle model");
	System.out.println(numberPlate+" is the vehicle number");
	System.out.println(colour+" is the colour of vehicle");
}
public void VehicleStart() {
	System.out.println("here the vehicle starts");
	System.out.println();
}
}
class Car extends  Vehicle{
    private int speed;
	public Car(String ModelName, int numberPlate, String colour,int speed) {
		super(ModelName, numberPlate, colour);
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}
	public void VehicleCarInformation() {
		super.VehicleInformation();
		System.out.println(speed+" km/hr is the speed of the car");
	}
	public void VehicleStart() {
		System.out.println("here the car starts");
		
	}
}
class VehicleMain{
	public static void main(String[]args)
	{
		Vehicle vehicle = new Vehicle("Hyundai", 1234, "Blue");
		vehicle.VehicleInformation();
		vehicle.VehicleStart();
		
		Car car = new Car("Creta",6789,"White",88);
		car.VehicleCarInformation();
		car.VehicleStart();
		
	}
}