package com.tnsif.MultiThreading;

class Eclipse extends Thread
{
	public void run()//running state
{
		System.out.println("Eclipse id: "+""+Thread.currentThread().getId());
		}
}
class OneNote extends Thread
{
	public void run()
{
		System.out.println("OneNote id: "+""+Thread.currentThread().getId());
		}
}
class chrome extends Thread
{
	public void run()
{
		System.out.println("chrome id: "+""+Thread.currentThread().getId());
		}
}

public class ExtendingThread 
{
	public static void main(String[] args)
	{
		Eclipse e=new Eclipse();//new state
		e.start();//runnable state
		
		OneNote o=new  OneNote();
		o.start();
		
		chrome c=new chrome();
		c.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Main method thread id: "+""+Thread.currentThread().getId());
		}
	}

}
