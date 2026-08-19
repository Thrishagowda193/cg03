package com.tnsif.ConstructorDemo;

import java.util.Scanner;

class em
{
	int id;
	String name;
	String dep;
	double sal;
	
 em(int id,String name,String dep,double sal){
	   this.id=id;
	   this.name =name;
	   this.dep =dep;
	   this.sal =sal;
	   
}
void display()
{
System.out.println("Employee Details");
System.out.println("id  " + id);
System.out.println("name  " + name); 
System.out.println("department " + dep);
System.out.println("salary  " + sal);

}
}


public class parameterized {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the id");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the name");
	String name=sc.nextLine();
	System.out.println("Enter the department");
	String dep=sc.nextLine();
	System.out.println("Enter the salary");
	double sal=sc.nextDouble();
	
	em e=new em(id, name, dep, sal);
			e.display();
			
}
}
