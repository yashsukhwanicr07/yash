package com.cg_vip.lab2;

public class Person 
{
		private String FirstName;
		private String LastName;
		private char gender;
		private int age;
		
		public Person(String firstName, String lastName, char gender, int age) throws MyException
		{
			FirstName = firstName;
			LastName = lastName;
			this.gender = gender;
			try{
				if(age<=15)
				{
					throw new MyException("Enter age above 15");
				}
				else
				{
					this.age = age;
					System.out.println(this);
				}
			}
			catch(MyException e)
			{
				System.out.println(e);
			}		
			
			
		}
			
		
		
		@Override
		public String toString() {
			return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", gender=" + gender + ", age=" + age
					+ "]";
		}
		
		
}
