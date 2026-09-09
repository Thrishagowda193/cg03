package com.tnsif.StringProg;

public class StringEqualsMethod 
{
	public static void main(String[] args)
	{
		String s1="Thri";
		String s2="sha";
		String s3="thri";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));	
	}	
}
