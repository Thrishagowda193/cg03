package com.tnsif.ExceptionHandling;

public class Throws 
{
	static void cal(int a,int b)throws ArithmeticException
	{
		int result=a/b;
		System.out.println("Result:"+result);
	}
public static void main(String[] args) 
{
	try
	{
		cal(10,7);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Cannot divide by zero");
	}
}
}
