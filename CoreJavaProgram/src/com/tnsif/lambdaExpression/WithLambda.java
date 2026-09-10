package com.tnsif.lambdaExpression;

@FunctionalInterface
interface draw
{
	public void draw();
}

public class WithLambda
{
	public static void main(String[] args) 
	{
		int width=70;
		draw d2=()->{ System.out.println("Draw:"+width);};
	    d2.draw();
    }
}

