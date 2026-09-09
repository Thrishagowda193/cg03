package com.tnsif.StringProg;

public class StringMethods
{ 
	public static void main(String[] args)
	{
		String s="Hello Java Programing";
		System.out.println("String length:"+ s.length());
		System.out.println("String contains:"+ s.contains("java"));
		System.out.println("String in uppercase:"+ s.toUpperCase());
		System.out.println("String lowecase:"+ s.toLowerCase());
		System.out.println("String replace:"+ s.replace("Hello","Hi"));
		System.out.println("String replace:"+ s.substring(11,21));
	}
}
