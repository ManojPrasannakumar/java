package com.example.assignment;

import java.util.Scanner;

class Venue{
	private String name;
	private String city;    
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	void venueDetails() {
		System.out.println("Venue Details");
		System.out.println("Venue Name: "+name);
		System.out.println("City Name: "+city);
	}
	
}
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Venue v = new Venue();
	Main m = new Main();
	System.out.println("Enter the Venue Name: ");
	v.setName(sc.nextLine());
	System.out.println("Enter the City Name: ");
	v.setCity(sc.nextLine());
	v.venueDetails();
	m.menuCall(sc);
	
	if(sc.nextInt()==1) {
		System.out.println("Enter the Venue Name: ");
		v.setCity(sc.nextLine());
		v.venueDetails();
		m.menuCall(sc);
	}
	
	if(sc.nextInt()==2) {
		System.out.println("Enter the City Name: ");
		v.setName(sc.nextLine());
		v.venueDetails();
		m.menuCall(sc);
	}
	
	if(sc.nextInt()==3) {
		v.venueDetails();
		m.menuCall(sc);
	}
}
	void menuCall(Scanner sc) {
		System.out.println("Verify and Update Venue Details");
		System.out.println("Menu");
		System.out.println("1.Update Venue Name");
		System.out.println("2.Update City Name");
		System.out.println("3.All informations Correct/Exit");
		System.out.println("Enter 1 or 2 or 3");
	}
}