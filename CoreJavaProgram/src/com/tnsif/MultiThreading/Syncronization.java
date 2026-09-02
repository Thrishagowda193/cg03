package com.tnsif.MultiThreading;

class Account
{
	int bal=10000;
	synchronized void deposit(int amt)
	{
		System.out.println(Thread.currentThread().getName() +" is deposit "+amt);
	int CurrentBal=bal;
	
	try
	{
		Thread.sleep(1000);
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	bal=CurrentBal+amt;
	System.out.println(Thread.currentThread().getName() +"Completed Balance"+bal);
  }
}

class DepositTask implements Runnable
{
	Account act;
	DepositTask(Account act)
	{
		this.act=act;
	}

	@Override
	public void run()
	{	
		act.deposit(500);
	}
	
}

public class Syncronization
{
	public static void main(String[] args) 
	{
		Account act=new Account();
		DepositTask t=new DepositTask(act);
		
		Thread t1=new Thread(t,"Thrisha");
		Thread t2=new Thread(t,"Lavanya");
		
		t1.start();
		t2.start();
	 }

}
