package com.tnsif.ExceptionHandling;

public class NullPointer2 
{
 public static void main(String[] args)  
 {
	String emp="Thri";
	String dep=null;
	String designation="Developer";
	try
	{
		System.out.println("Employee:"+emp);
		System.out.println("Designation:"+designation);
		System.out.println("Department:"+dep.toUpperCase());

	}
	catch(NullPointerException r)
	{
		System.out.println("department information is missing");
		System.out.println(r);
	}
	System.out.println("Program continueee.......");
	}
}
