package com.tnsif.MultiThreading;

class Whatsapp implements Runnable
{

	@Override
	public void run()//runnable state
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Whatsapp id: "+""+Thread.currentThread().getId());
		}
		
	}
	
}

public class ImplementingRunnable 
{
	public static void main(String[] args) 
	{
		Whatsapp w =new Whatsapp();
		Thread o=new Thread(w);//new state
		o.start();//running state
		System.out.println("Main method thread id: "+""+Thread.currentThread().getId());
	}

}
