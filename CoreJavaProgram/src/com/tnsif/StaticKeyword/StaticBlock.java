package com.tnsif.StaticKeyword;

public class StaticBlock
{
	static int employeecount;
	
	static {
		employeecount=100;
		System.out.println("Employee system intialization ");
	}
public static void main(String[] args)
{
	
  System.out.println("Starting employee system.....");
  System.out.println("Employee count="+ employeecount);

 }
}
