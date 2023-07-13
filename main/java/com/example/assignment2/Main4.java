package com.example.assignment2;

import java.util.Scanner;

class Players{
	String[] pldetails= {};
	
	void playerDetails(String ...s) {
		System.out.println("Player Details");
		System.out.println("Player Name: "+s[0]);
		System.out.println("Country Name: "+s[1]);
		System.out.println("Skill: "+s[2]);
	}
}

public class Main4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Players p = new Players();
	System.out.println("Enter the Player Details: ");
	String str = sc.nextLine();
    String[] strSplit = str.split(",");
	p.playerDetails(strSplit);
	
}
}
