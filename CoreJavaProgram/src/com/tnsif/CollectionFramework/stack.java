package com.tnsif.CollectionFramework;

import java.util.Stack;

public class stack 
{
	public static void main(String[] args) 
	{
		Stack<String> s= new Stack<>();
		s.add("Rose");
		s.push("lily");
		s.push("Hibiscus");
		s.push("Lotus");
		System.out.println("My stack elements are:"+s);
		s.pop();
		System.out.println("After pop elements are:"+s);
		s.capacity();
		System.out.println("Capicity are:"+s);
		s.clear();
		System.out.println("After clear the elemnts are:"+s);
	}

}
