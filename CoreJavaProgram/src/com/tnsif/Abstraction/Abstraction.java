package com.tnsif.Abstraction;

abstract class delivery
{
	abstract double CalculateCharge(double distance);
	
	 void show()
	 {
		 System.out.println("Delivery charges");
	 }	 

}

 class bikedelivery extends delivery{

	@Override
	double CalculateCharge(double distance) {
		// TODO Auto-generated method stub
		
		return distance*10;
	}
	 
 }
 
 class drowndelivery extends delivery{

	@Override
	double CalculateCharge(double distance) {
		// TODO Auto-generated method stub
		
		return distance*20;
	}
	 
 }
 
 public class Abstraction
 {
	 public static void main(String[] args)
	 { 
		 bikedelivery b=new bikedelivery();
		 b.show();
		 System.out.println("The bike delivery charges are:"+b. CalculateCharge(5));
		 drowndelivery d=new drowndelivery();
		 System.out.println("The drown delivery charges are:"+d. CalculateCharge(5));	  
	}
 }