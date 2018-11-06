package com.lad;

public class MathTteacher extends Teacher {
	public MathTteacher(String name, double salary) {
		super(name, salary);
	}
	
	public double getBonus() {
    	return this.salary * 1.6;
    }
}
