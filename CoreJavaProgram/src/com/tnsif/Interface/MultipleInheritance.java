package com.tnsif.Interface;

interface TechnicalRole
{
	void designArchitecture();
}

interface ManagementRole
{
	void MangeTeam();
}

class ProjectManager implements TechnicalRole,ManagementRole
{
	 private String name;
	 private String ProjectName;
	 private int teamsize;
	 private double projectBudget;
	 
	 public ProjectManager(String name, String projectName, int teamsize, double projectBudget) {
		super();
		this.name = name;
		ProjectName = projectName;
		this.teamsize = teamsize;
		this.projectBudget = projectBudget;
	 }

@Override
public void MangeTeam() 
{
	System.out.println("Managing a team of:"+teamsize+" Developers");
	
}



@Override
public void designArchitecture() 
{
  System.out.println(name+"is architecture for"+ProjectName);
	
}


void checkBudget()
{
	if(projectBudget>100000)
	{
	  System.out.println("High budget project");
    }
   else
   {
	 System.out.println("Standard budget project");
   }
}


void displayProjectDetails()
{
	System.out.println("Project Details");
	System.out.println("Manager:"+name);
	System.out.println("Project:"+ProjectName);
	System.out.println("Team:"+teamsize);
	System.out.println("Budget:"+projectBudget);
}
}
public class MultipleInheritance 
{
	public static void main(String[] args)
	{
		ProjectManager p=new ProjectManager("Thri","E-commerce",7,2500000);
		p.designArchitecture();
		p.MangeTeam();
		p.checkBudget();
		p.displayProjectDetails();
		
		
	}
}

