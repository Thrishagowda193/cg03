package com.tnsif.lambdaExpression;

interface square
{
	double squ(double side);
}

public class AreaOfSquare
{
	public static void main(String[] args)
	{
		square s1=(side)->(side*side); double sidelength=20; double area=s1.squ(sidelength);
		System.out.println(area);
	}
 }

