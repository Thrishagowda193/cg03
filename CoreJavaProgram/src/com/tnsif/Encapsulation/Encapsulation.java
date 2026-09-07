package com.tnsif.Encapsulation;

class Employee
{
	private int empid;
	private String empname;
	private double sal;
	private String dept;
	

	public Employee(int empid, String empname, double sal, String dept) 
	{
		super();
		this.empid = empid;
		this.empname = empname;
		this.sal = sal;
		this.dept = dept;
	}
	
    //Getters
	public int getEmpid()
	{
		return empid;
	}
	public String getEmpname() 
	{
		return empname;
	}
	public double getSal() 
	{
		return sal;
	}

	public String getDept() 
	{
		return dept;
	}

	
    //Setters
	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}

	public void setEmpname(String empname)
	{
		this.empname = empname;
	}

	public void setSal(double sal)
	{
		this.sal = sal;
	}

	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	//Method to increase salary
	public void increaseSalary(double per)
	{
		sal=sal+(sal*per/100);
	}
	
	//Display employee details
	public void displayEmployeeDetails()
	{
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+empname);
		System.out.println("Employee Department:"+dept);
		System.out.println("Employee Salary:"+sal);
		
	}
}

public class Encapsulation
{
public static void main(String[] args) 
{
	Employee e1=new Employee(101,"Thri",3000,"IT");
	Employee e2=new Employee(102,"Vini",7000,"HR");
	System.out.println("Employee Details:");
	System.out.println();
	e1.displayEmployeeDetails();
	e2.displayEmployeeDetails();
	
	e1.increaseSalary(10);
	System.out.println("After salary increase");
	System.out.println();
	e1.displayEmployeeDetails();
	e2.displayEmployeeDetails();
	
}
}
