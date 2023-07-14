package com.example.demo;

import java.util.Scanner;

class Player{
	private String name;
	private String country;
	
	public Player() {
		
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + "]";
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

	@Override
	public String toString() {
		super.toString();
		return "InternationalPlayer [capNumber=" + capNumber + ", noOfTestAppearance=" + noOfTestAppearance
				+ ", noOfODIAppearance=" + noOfODIAppearance + "]";
	}


	
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter player name");
		String name = sc.nextLine();
		System.out.println("Enter player country");
		String country = sc.nextLine();
		System.out.println("Enter the Cap number");
		String capNum = sc.nextLine();
		System.out.println("Enter the number of test appearnace");
		Long noOfTest = Long.parseLong(sc.nextLine());
		System.out.println("Enter the number of ODI appearnace");
		Long noOfODI = Long.parseLong(sc.nextLine());
		
		InternationalPlayer ip = new InternationalPlayer(name, country, capNum, noOfTest, noOfODI);
		System.out.println(ip);
		
	}

}
