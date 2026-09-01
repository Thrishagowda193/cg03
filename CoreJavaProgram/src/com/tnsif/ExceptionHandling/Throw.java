package com.tnsif.ExceptionHandling;

public class Throw
{
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Student is not eligiable for voting");
		}
		System.out.println("Student is eligible");
	}
public static void main(String[] args) 
{
	try
	{
		checkAge(16);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
}
}
