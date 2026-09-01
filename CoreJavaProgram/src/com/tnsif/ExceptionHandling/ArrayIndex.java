package com.tnsif.ExceptionHandling;

public class ArrayIndex
{
public static void main(String[] args) 
{
int marks[]= {80,75,65,70};
try
{
	System.out.println(marks[2]);
	System.out.println(marks[5]);
	System.out.println(marks[1]);
}
catch(ArrayIndexOutOfBoundsException a)
{
	System.out.println(a);
}
System.out.println("Program continueee.......");
}
}
