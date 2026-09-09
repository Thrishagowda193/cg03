package com.tnsif.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Studies
{
	String Category;
	int Price;
	
	public Studies(String category, int price)
	{
		super();
		Category = category;
		Price = price;
	}

	@Override
	public String toString()
	{
		return "Book [Category=" + Category + ", Price=" + Price + "]";
	}
	
}
	class BookComparator implements Comparator<Studies>
	{

		@Override
		public int compare(Studies o1, Studies o2) 
		{  
		   int result = o1.Category.compareTo(o2.Category);
		   if(result==0)
		    {
			  return o1.Price-o2.Price;
		    }
		return result;
	   }
}

public class comparator2
{
	public static void main(String[] args)
	{
		List<Studies>p=new ArrayList<>();
		p.add(new Studies("Java",30));
		p.add(new Studies("Python",90));
		p.add(new Studies("Java",70));
		p.add(new Studies("C++",40));
		
		Collections.sort(p,new BookComparator());
		System.out.println(p);
	}
}

