package com.tnsif.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable <Student>
{
	int marks;
	String name;
	
	public Student(int marks, String name) 
	{
		super();
		this.marks = marks;
		this.name = name;
	}
	
	//@Override // for integer
	//public int compareTo(Student o)
	//{
	//	return this.marks-o.marks;
	//}
	
	@Override// for string
	public int compareTo(Student o)
	{
		return o.name.compareTo(this.name);
	}
	
	@Override
	public String toString() 
	{
		return "Student [marks=" + marks + ", name=" + name + "]";
	}  
}

public class ComparableInterface 
{
	public static void main(String[] args)  
	{
		ArrayList<Student> s= new ArrayList<>();
		s.add(new Student(85,"Vinay"));	
		s.add(new Student(75,"Jeevan"));	
		s.add(new Student(77,"Naveen"));	
		s.add(new Student(55,"Deeraj"));	
		
		Collections.sort(s);
		System.out.println(s);
	}

}
