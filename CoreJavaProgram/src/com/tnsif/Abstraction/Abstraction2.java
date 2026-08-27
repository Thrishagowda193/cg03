package com.tnsif.Abstraction;

abstract class EmployeSalary
{
	abstract double calculateSalary(double sal); 
}

class FullTimeEmployee extends EmployeSalary
{

	@Override
	double calculateSalary(double sal)
	{
		// TODO Auto-generated method stub
		return sal*12;
	}
	
}
class PartTimeEmployee extends EmployeSalary
{

	@Override
	double calculateSalary(double sal)
	{
		// TODO Auto-generated method stub
		return sal*2;
	}
	
}
public class Abstraction2
{
	public static void main(String[] args)
	{
		System.out.println("Full Time Employee salary calculation");
		 FullTimeEmployee f=new  FullTimeEmployee();
		 System.out.println( f. calculateSalary(10000));
		 System.out.println("Part Time Employee salary calculation");
		 PartTimeEmployee p=new  PartTimeEmployee();
		 System.out.println(p.calculateSalary(1000));	
		
	}
}
