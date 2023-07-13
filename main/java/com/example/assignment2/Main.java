package com.example.assignment2;

import java.util.Scanner;

class Venue{
	String name;
	String city;    
	
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
	System.out.println("Enter the Venue Name: ");
	v.name = sc.nextLine();
	System.out.println("Enter the City Name: ");
	v.city = sc.nextLine();
	v.venueDetails();
	
}
}
