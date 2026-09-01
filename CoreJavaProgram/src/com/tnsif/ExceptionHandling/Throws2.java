package com.tnsif.ExceptionHandling;

public class Throws2
{
	static void login(String username,String password)throws Exception
	{
		if(username.equals("admin"))
		{
			throw new Exception("Invalid username");
		}
		if(!password.equals("1234"))
		{
			throw new Exception("Invalid password");
		}
		System.out.println("Login sucessful");
	}
	public static void main(String[] args)
	{
		try
		{
			login("admin","111");
		}
		catch(Exception s)
		{
			System.out.println(s);
		}
		System.out.println("Login process completed");
	}
}
