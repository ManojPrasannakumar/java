package com.example.assignment3;
interface MyCollege{
	void staffname();
}
public class Teacher {
	String name;
	
	public void getName() {
		System.out.println("Arjun");
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Teacher t = new Teacher();
		MyCollege mc = t::getName;
		mc.staffname();
	}
}
