package com.cp_yash.prgm2.bean;
public class Main 
{

	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.setName("smith");
		Person p2=new Person();
		p2.setName("Kathy");
		Account smith=new SavingsAccount();
		smith.setActype("SavingsAccount");
		smith.setAccHolder(p1);
		smith.setBalance(2000);
		Account Kathy=new CurrentAccount();
		Kathy.setActype("CurrentAccount");
		Kathy.setAccHolder(p2);
		Kathy.setBalance(3000);
		smith.withdraw(2000);
		Kathy.withdraw(2000);
		Kathy.withdraw(2000);
		Kathy.withdraw(2000);
		Kathy.withdraw(2000);
		Kathy.withdraw(2000);
		Kathy.withdraw(2000);
		System.out.println(smith);
		System.out.println(Kathy);
		}

}
