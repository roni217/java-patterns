package com.lad;

public class HistoryTeacher extends Teacher {

	public HistoryTeacher(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double getBonus() {
		return this.salary;
	}

}
