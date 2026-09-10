package com.tnsif.lambdaExpression;

@FunctionalInterface
interface demo
{
	String say(String msg);
}

public class MultipleLambda 
{
 public static void main(String[] args) 
  {
	demo s=(msg)->{String str1="I would like to say,"; String str2=str1+msg; return str2;};
	System.out.println(s.say("Time is precious"));
  }
}
