package com.tnsif.ExceptionHandling;

public class Finally
{
public static void main(String[] args)
{
	// without exception
	try
	{
		System.out.println("Welcome");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Welcome to java");
	}
	
	
	
	
	// with exception
	try
	{
		System.out.println(6/0);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Welcome to java");
	}




  // without matching catching 
	try
	{
		System.out.println(6+8);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Welcome to java");
	}
}


}
