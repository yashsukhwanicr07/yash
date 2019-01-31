package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeInterface 
{
	public Employee setDetails(int id,String name,double salary,String designaton);
	public void insurance(double salary,String designation);
	public void printDetails();
}
