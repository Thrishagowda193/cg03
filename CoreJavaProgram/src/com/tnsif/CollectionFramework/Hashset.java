package com.tnsif.CollectionFramework;

import java.util.HashSet;

public class Hashset
{
	public static void main(String[] args) 
	{
		HashSet<String> javaTeam=new HashSet<>();
		javaTeam.add("Java");
		javaTeam.add("SQL"); 
		javaTeam.add("Git");
		javaTeam.add("Spring");
		javaTeam.add("Docker");
		javaTeam.add(null);
		System.out.println(javaTeam);
		
		
		HashSet<String> pythonTeam=new HashSet<>();
		pythonTeam.add("Python");
		pythonTeam.add("SQL"); 
		pythonTeam.add("Git");
		pythonTeam.add("AWS");
		System.out.println(pythonTeam);
		
		
		HashSet<String> common= (HashSet<String>) javaTeam.clone();//create the copy of java team's skills
		System.out.println(common);
		
		common.retainAll(pythonTeam);//keep only skills available in both team
		System.out.println("common skills:"+common);
		
		HashSet<String> onlyJava= (HashSet<String>) javaTeam.clone();//create a another copy of java team's skills
		onlyJava.removeAll(pythonTeam);
		System.out.println("only java team:"+onlyJava);
	}

}
