package com.tnsif.Interface;

interface Payment
{
	void pay(double amt);
	void checkStatus();
}

class UPI implements Payment
{

	@Override
	public void pay(double amt)
	{
		
		System.out.println("Paid "+ amt+" using UPI");
	}

	@Override
	public void checkStatus() 
	{
		
		System.out.println("UPI payments successful");
	}
	
}


public class Main
{
 public static void main(String[] args)
 {
	UPI u=new UPI();
	u.pay(1321);
	u.checkStatus();
 }
}
