package com.tnsif.CollectionFramework;

import java.util.Vector;

public class vector 
{
	public static void main(String[] args) 
	{
		
		Vector<Integer> v = new Vector<>();
		              
		v.add(1);
		v.add(12);
		v.add(15);
		v.add(155);
		v.add(177);
		System.out.println(v);
		v.capacity();
		System.out.println(v);
		System.out.println(v.contains(12));
		v.removeFirst();
		System.out.println(v);
		for(int h:v)
		{
			System.out.println(h);
		}
		v.clear();
		System.out.println(v);
	}

}
