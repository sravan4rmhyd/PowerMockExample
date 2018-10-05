package org.example;

public class Person {
	
	private String fname;
	
	private String lanme;	
	
	public Person(String fname, String lanme) {
		super();
		this.fname = fname;
		this.lanme = lanme;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLanme() {
		return lanme;
	}

	public void setLanme(String lanme) {
		this.lanme = lanme;
	}
}
