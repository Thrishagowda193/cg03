package com.tnsif.ExceptionHandling;

public class Throw2  
{
	static void checkPassword(String password)
	{
		if(password.length()<6)
		{
			throw new IllegalArgumentException("Password is too short");
		}
		System.out.println("Password accepted");
	}
	
public static void main(String[] args) 
{
	try
	{
		checkPassword("abc");
	}
	catch(IllegalArgumentException e)
	{
		System.out.println(e.getMessage());
	}
}
}
