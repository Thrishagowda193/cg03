package com.tnsif.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book
{
	String name;
	int age;
	
	public Book(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void display()
	{
		System.out.println("Name: "+ name  + "Age: "+ age);
	}
}

	class NameComparator implements Comparator<Book>
	{
	@Override
	public int compare(Book o1, Book o2)
	{
		
		return o1.name.compareTo(o2.name);
	}
		
	}
	
	class AgeComparator implements Comparator<Book>
	{

      @Override
      public int compare(Book o1, Book o2)
      {
	     return Integer.compare(o1.age,o2.age);
	  }
	}
	


public class comparator
{
	public static void main(String[] args)
		{
			List<Book>p=new ArrayList<>();
			p.add(new Book("John",30));
			p.add(new Book("Joseph",90));
			p.add(new Book("Jack",70));
			p.add(new Book("Johnsen",40));
			
			Collections.sort(p,new NameComparator());
			System.out.println("Sorted by name");
			for(Book s:p)
			{
				s.display();
			}
			
			Collections.sort(p,new AgeComparator());
			System.out.println("Sorted by age");
			for(Book s:p)
			{
				s.display();
			}
			
		}

}