package com.example1.ST1;

public class Student {
	private String name;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void displayInfo()
	{
		System.out.println("Your name is "+name+" age is "+age);
	}

}
