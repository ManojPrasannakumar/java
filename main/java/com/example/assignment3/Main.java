package com.example.assignment3;

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

	public Venue(){
		
	}
	
	public Venue(String name, String city) {
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Venue [name=" + name + ", city=" + city + "]";
	}
}
class VenueBO{
	void displayVenueDetails(Venue venue) {
		System.out.println("Venue Details");
		System.out.println(venue.getName()+","+venue.getCity());
	}
}
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Venue v = new Venue();
	System.out.println("Enter the Venue Name: ");
	v.setName( sc.nextLine());
	System.out.println("Enter the City Name: ");
	v.setCity( sc.nextLine());
	VenueBO v2 = new VenueBO();
	v2.displayVenueDetails(v);
}
}
