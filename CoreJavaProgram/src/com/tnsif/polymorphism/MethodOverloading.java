package com.tnsif.polymorphism;

public class MethodOverloading
{

double CalculateaArea(double PI, float r  )
{
	return  PI*r*r;
}
int CalculateaArea( int w, int l  )
{
   return w*l;
}

int CalculateaArea(int s )
{
  return s*s;
}

public static void main(String[] args)
{
	MethodOverloading c=new MethodOverloading();
	System.out.println(c.CalculateaArea(3.14,2));
		
	System.out.println(c.CalculateaArea(2,5));
		
	System.out.println(c.CalculateaArea(4));
		
	}
}
