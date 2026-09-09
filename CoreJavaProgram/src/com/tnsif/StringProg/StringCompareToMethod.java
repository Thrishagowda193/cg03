package com.tnsif.StringProg;

public class StringCompareToMethod 
{
	public static void main(String[] args) 
	 {
		
		String s1=new String("Thri");
		String s2="thri";
		String s3="thri";
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
	}
	
}
