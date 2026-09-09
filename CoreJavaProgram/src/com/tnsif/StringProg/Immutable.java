package com.tnsif.StringProg;

public class Immutable 
{
 public static void main(String[] args)  
 {
	 //using literals
	String s1="Thri";
	String s2=s1;
	String s3=s2;
	
	System.out.println("Before modification");
	System.out.println("s1:"+s1);
	System.out.println("s2:"+s3);
	System.out.println("s3:"+s3);
	
	s1="sha";
	System.out.println("After modification");
	System.out.println("s1:"+s1);
	System.out.println("s2:"+s3);
	System.out.println("s3:"+s3);
			
}
}
