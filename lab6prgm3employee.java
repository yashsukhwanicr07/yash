package com.cg.eis.bean;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	private String designation;

	private String insuaranceScheme;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public String getDesignation() 
	{
		return designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public String getInsuaranceScheme(double salary, String designation)
	{
		if((salary >5000 && salary<20000) && designation.equals("System Associate"))
		{
			setInsuaranceScheme("Scheme C");
		}
		if((salary >=20000 && salary<40000) && designation.equals("Programmer"))
		{
			setInsuaranceScheme("Scheme B");
		}
		if(salary >40000 && designation.equals("Manager"))
		{
			setInsuaranceScheme("Scheme A");
		}
		if(salary<5000 && designation.equals("Clerk"))
		{
			setInsuaranceScheme("No Scheme");
		}
		else
			setInsuaranceScheme("No Criteria");
		return insuaranceScheme;
	}
	
	public void setInsuaranceScheme(String insuaranceScheme)
	{
		this.insuaranceScheme = insuaranceScheme;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + ", insuaranceScheme=" + insuaranceScheme + "]";
	}
	
}
