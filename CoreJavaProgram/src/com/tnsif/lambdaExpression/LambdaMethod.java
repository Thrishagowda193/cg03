package com.tnsif.lambdaExpression;

import java.util.Scanner;

interface ElectricityBill
{
	double cal(int units);
}
public class LambdaMethod
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the electric bill");
		int units=s.nextInt();
		ElectricityBill bill=(u)->{
			if(u>1000)
			{
				return u*2;
			}
			else if(u<=200)
			{
				return (100*3)+((u-100)*5);
			}
			else
			{
				return(100*3)+(100*5)+((u-200)*7);
			}
		};
	  System.out.println("Electricity Bill"+ bill.cal(units));
	}

}
