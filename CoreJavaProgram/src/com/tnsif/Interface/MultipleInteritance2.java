package com.tnsif.Interface;

interface GPS
{
	void trackLOcation();
	void CalculateRoute();
}
interface VehicleSafety 
{
	void detectCollision();
	void applyEmergencyBrake();
}

class SmartVehicle implements GPS,VehicleSafety
{
	public int vechileNUmber;
	public int model;
	public double CurrentSpeed;
	public String location;
	
	public SmartVehicle(int vechileNUmber, int model, double currentSpeed, String location)
	{
		super();
		this.vechileNUmber = vechileNUmber;
		this.model = model;
		this.CurrentSpeed = currentSpeed;
		this.location = location;
	}

	@Override
	public void detectCollision()
	{
		if(CurrentSpeed>100) 
		{
			System.out.println("Collision occurs in nearest to 10 % then activate emergency brake system");
		}
		else
		{
			System.out.println("Drive in normal mode");
		}
		
	}

	@Override
	public void applyEmergencyBrake() {
		System.out.println("Activates when collision occur");
		
	}

	@Override
	public void trackLOcation() 
	{
		
		System.out.println("Can be tracked through GPS");
	}

	@Override
	public void CalculateRoute()
	{
		System.out.println("Calculating routing in terms of kilometer");
		
	}
	
	void display()
	{
		System.out.println("Vehicle location:"+location);
		System.out.println("Route information based on requirement");
		System.out.println("Speed of vechile:"+CurrentSpeed);
		System.out.println("Safety status on");
	}
}
public class MultipleInteritance2 
{
	public static void main(String[] args) {
		SmartVehicle s=new SmartVehicle(1011,1940,200,"kolar");
		s.detectCollision();
		s. applyEmergencyBrake();
		s.trackLOcation();
		s.CalculateRoute();
		s.display();
	}

}
