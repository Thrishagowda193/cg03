package com.tnsif.polymorphism;

 class BankAccount
 {
	 void calculateinterest(double amount)
	 {
		 System.out.println("Calculation of standard bank interest");
		 System.out.println("Amount:"+amount);
	 }
 }
 
 class SavingAccount extends BankAccount
 {
	 @Override
	 void calculateinterest(double amount)
	 {
		 double interest=amount*0.04;
		 System.out.println("Saving Account");
		 System.out.println("Principal:"+ amount);
		 System.out.println("Interest" +interest);
	 }
 }
 class FixedAccount extends BankAccount
 {
	 @Override
	 void calculateinterest(double amount)
	 {
		 double interest=amount*0.07;
		 System.out.println("Fixed Deposit");
		 System.out.println("Principal:"+ amount);
		 System.out.println("Interest"+ interest);
	 }
 }
 
 class CurrentAccount extends BankAccount
 {
	 @Override
	 void calculateinterest(double amount)
	 {
		 System.out.println("Current Account");
		 System.out.println("No interest provided");
		 
	 }
 }
public class methodoverding
{
	public static void main(String[] args)
	{
		BankAccount A;
		A = new SavingAccount();
		A.calculateinterest(100000);
		System.out.println();
		
		A = new FixedAccount();
		A.calculateinterest(100000);
		System.out.println();
		
		A = new CurrentAccount();
		A.calculateinterest(100000);
		
	}
}


