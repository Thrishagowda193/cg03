package com.tnsif.ExceptionHandling;

public class StringIndex {
	public static void main(String[] args) {
		String name="Java";
		try
		{
			System.out.println(name.charAt(0));
			System.out.println(name.charAt(3));
			System.out.println(name.charAt(9));//exception 
			System.out.println("Welcome");//once catch occur this message will not be printed

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Program continueee.......");
	}

}
