package com.tnsif.StaticKeyword;

public class StaticMethod {
	static int calculateBonus(int salary)
	{
		return salary*10/100;
	}
public static void main(String [] args) {
	int bouns=StaticMethod.calculateBonus(30000);
	System.out.println("Bonus:"+bouns);
}
}
