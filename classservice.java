package com.cg.eis.service;

import com.cg.eis.Exception.EmployeeException;
import com.cg.eis.bean.Employee;

public class Service implements EmployeeInterface
{
	Employee e;
	
	@Override
	public Employee setDetails(int id, String name, double salary, String designation) 
	{
		e = new Employee();
		e.setId(id);
		e.setName(name);
		try{
				if(salary<3000)
					throw new EmployeeException("Salary Not true");
				else
					e.setSalary(salary);
			}
		catch(EmployeeException ex)
		{
			System.out.println(ex);
		}
		e.setDesignation(designation);
		return e;
	}

	@Override
	public void insurance(double salary, String designation)
	{
	   e.setInsuaranceScheme(e.getInsuaranceScheme(salary, designation));
	}
	
	@Override
	public void printDetails()
	{
		System.out.println(e);
	}
}
