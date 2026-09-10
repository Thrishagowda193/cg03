package com.tnsif.lambdaExpression;

@FunctionalInterface
interface Drawable
{
	public void draw();
}

class test implements Drawable
{

	@Override
	public void draw() 
	{ int width=20;
		System.out.println("Drawing:"+width);
		
	}
	
}

public class WithoutLambda
{

	public static void main(String[] args) 
	{
		Drawable d=new test();
		d.draw();
	}
}
