package com.cp_yash.prgm2.bean;

public class SavingsAccount extends Account 
{
	final long minBalance=500;
	public void withdraw(double a)
	{
		if((this.getBalance()-a)<500)
		{
			System.out.println("Insufficient Balance");
		}
		else
			setBalance(getBalance()-a);
	}
}
