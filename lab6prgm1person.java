package com.cg_vip.lab1;

public class Person 
{
		private String FirstName;
		private String LastName;
		private char gender;
		
		Person(String a,String b,char g) throws MyException
		{
			this.setFirstName(a);
			this.setLastName(b);
			this.setGender(g);
			try{
					if(getFirstName()==null)
						throw new MyException("First Name is left blank");
				
					if(getLastName()==null)
						throw new MyException("Last Name is left blank");
					
					System.out.println(this);
					
					
					
				}
				catch(MyException e)
				{
					System.out.println(e);
				}
			}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
	
		@Override
		public String toString() {
			return "PersonDetails"+"\n-------------"+"\nFirstName:" + FirstName + "\nLastName:" + LastName + "\ngender:" + gender;
		}
		
}
