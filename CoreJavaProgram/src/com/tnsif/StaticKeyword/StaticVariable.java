package com.tnsif.StaticKeyword;
class Employe
{
int id;
String name;
static String company="TCS";

Employe(int id,String name)
{
	this.id=id;
	this.name=name;
}
 void display()
 {
	 System.out.println(id+" "+name+" "+company);
 }
}
 

public class StaticVariable 
{
public static void main(String[] args) 
{
	Employe e1=new Employe(101,"Thrisha");
	Employe e2=new Employe(101,"Vinay");
	Employe e3=new Employe(101,"Geetha");
	
	e1.display();
	e2.display();
	e3.display();
}
}
