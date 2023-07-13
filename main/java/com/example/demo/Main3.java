package com.example.demo;

import java.util.Scanner;

class Player{
	private String name;
	private String country;
	
	public Player() {
		
	}
	public Player(String name, String country) {
		this.name = name;
		this.country = country;
	}
	 public void displayDetails() {
		 System.out.println("Player Details");
		 System.out.println("Name: "+ name+" Country: "+country);
	 }
}

class InternationalPlayer extends Player{
	String capNumber;
	Long noOfTestAppearance;
	Long noOfODIAppearance;
	
	public InternationalPlayer(String name, String country, String capNumber, Long noOfTestAppearance,
			Long noOfODIAppearance) {
		super(name, country);
		this.capNumber = capNumber;
		this.noOfTestAppearance = noOfTestAppearance;
		this.noOfODIAppearance = noOfODIAppearance;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
	}

	
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter player name");

		System.out.println("Enter player country");

		System.out.println("Enter the Cap number");


		System.out.println("Enter the number of test appearnace");
		

		System.out.println("Enter the number of ODI appearnace");
		
	}

}
