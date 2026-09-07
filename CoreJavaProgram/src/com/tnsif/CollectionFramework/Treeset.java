package com.tnsif.CollectionFramework;

import java.util.TreeSet;

public class Treeset 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<>();
		t.add(230000);
		t.add(730000);
		t.add(830000);
		//t.add(null);
		t.add(530000);
		t.add(250000);
		
		System.out.println("Salaries:"+t);
		System.out.println("Total Salaries:"+t.size());
		System.out.println("Contains Salaries:"+t.contains(230000));
		System.out.println("Lowest Salaries:"+t.first());//lowest
		System.out.println(t.last());
		System.out.println(t.headSet(250000));//below
		System.out.println(t.tailSet(500000));//above
		System.out.println(t.subSet(230000,500000));//between
				
	}
}
