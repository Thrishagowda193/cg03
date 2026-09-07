package com.tnsif.CollectionFramework;

import java.util.LinkedList;

public class Linkedlist 
{
	public static void main(String[] args)
	{
		LinkedList<String> h=new LinkedList<>();
		h.add("Google");
		h.add("Youtube");
		h.add("Chrome");
		h.add("Edge");
		
		System.out.println(h);
		
		h.addFirst("Firefox");
		h.addLast("Browser");
		System.out.println(h);
		System.out.println("First:"+h.peekFirst());
		System.out.println("Remove:"+h.pollFirst());//Remove first
		System.out.println(h);
	}
}
