package com.tnsif.ConstructorDemo;

class emp{
	String name;
	int salary;
	
	emp()
	 {
		 name="unknown";
	     salary=45000;
		 
	 }
	 void display()
	 {
		 System.out.println("Name "+name);
		 System.out.println("Salary "+salary);
		 
	 }
}

public class ConstructorDemo {
 public static void main(String[] args) {
	emp e =new emp();
	e.display();
	
}
}
