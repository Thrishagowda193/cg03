package com.tnsif.CollectionFramework;

import java.util.ArrayList;

public class Arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList<String> p=new ArrayList<>();
		
	     p.add("Laptop");
	     p.add("Mobile");
	     p.add("Headphone");
	     System.out.println(p);
	     System.out.println("!st product:" +p.get(1));
	     System.out.println("List contains: "+p.contains("Mobile"));
	     System.out.println(p.size());
	     p.remove("Headphone");
	     System.out.println(p);
	     for(String i:p)
	     {
	    	 System.out.println(i);
	     }		
	}
}
