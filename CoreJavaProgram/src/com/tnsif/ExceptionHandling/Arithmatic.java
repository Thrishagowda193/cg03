package com.tnsif.ExceptionHandling;

public class Arithmatic 
{
 public static void main(String[] args) 
 {
	int sal=50000;
	int workingDays=25;
	int bonusDays=5;
	
	try
	{
		int dailySalary=sal/workingDays;
		System.out.println("Daily salary:"+dailySalary);
		
		int bonusPerDay=sal/0;
		System.out.println("Bonus:"+(bonusPerDay*bonusDays));
	}
	catch(ArithmeticException e)
	{
		System.out.println("Cannot calculate salary bouns.....");
		System.out.println(e);
	}
	System.out.println("Salary processing completed.......");
}
}
                                                                                                                                                                                                                                                                                                                                                                                  