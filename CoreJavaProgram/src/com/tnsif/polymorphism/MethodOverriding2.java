package com.tnsif.polymorphism;
class Vehicle 
{
	void start()
	{
	System.out.println("vehicle is starting...");
}
}

class car extends Vehicle
{
	@Override
	void start()
	{
		System.out.println("Car starts with a key");
	}
	
}

class bike extends Vehicle
{
	@Override
	void start()
	{
		System.out.println("Bike starts with a self-start");
	}
	
}


public class MethodOverriding2 {
	
	public static void main(String[] args) {
		
		Vehicle v;
		v=new car();
		v.start();
		System.out.println();
		
		v=new bike();
		v.start();
	}

}
