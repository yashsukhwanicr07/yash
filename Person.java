package com.cp_yash.prgm2.bean;

public class Person 
{
	private float age;
	private String name;
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [age=" + age +",name="+ name + "]";
	}

}
