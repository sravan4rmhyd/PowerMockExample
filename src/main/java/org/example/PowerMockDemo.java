package org.example;

public class PowerMockDemo {
	
	private Person privateMethod(String fname,String lname)
	{
		return new Person(fname, lname);
	}
	
	public Person publicMethod(String fname,String lname)
	{
		return privateMethod(fname, lname);
	}
}
