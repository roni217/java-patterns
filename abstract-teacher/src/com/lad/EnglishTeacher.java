package com.lad;

public class EnglishTeacher extends Teacher{

	public EnglishTeacher(String name, double salary) {
		super(name, salary);
	}
	
	public double getBonus() {
    	return this.salary * 1.6;
    }

	public String getName() {
		return this.name + "English";
	};
	
}
