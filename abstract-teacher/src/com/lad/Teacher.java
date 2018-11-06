package com.lad;

public abstract class Teacher {

	protected String name;
    protected String age;
    protected double salary;
   
    public Teacher(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
    
	public abstract double getBonus();
	
	public String getName() {
		return this.name;
	};
	
}
