package com.example.assignment2;

import java.util.Scanner;

class Player{
	String name;
	String country;    
	String skill;    
	
	void playerDetails() {
		System.out.println("Player Details");
		System.out.println("Player Name: "+name);
		System.out.println("Country Name: "+country);
		System.out.println("Skill: "+skill);
	}

}
public class Main2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Player p = new Player();
	System.out.println("Enter the Player Name: ");
	p.name = sc.nextLine();
	System.out.println("Enter the country Name: ");
	p.country = sc.nextLine();
	System.out.println("Enter the skill: ");
	p.skill = sc.nextLine();
	
	p.playerDetails();
	
}
}
