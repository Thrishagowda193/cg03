package com.tnsif.Interface;

interface Eatable
{
	void Fruit(String color,String Taste);
}

class Strawberry implements Eatable
{

	@Override
	public void Fruit(String color, String Taste)
	{
		System.out.println("Color of strawberry is:"+ color);
		System.out.println("Taste of straeberry is:"+ Taste);
	}
	
}
public class FunctionalInterface
{
public static void main(String[] args)
{
	Strawberry e=new Strawberry();
	e.Fruit("Red","Sour");
}
}
