package com.example.assignment2;

import java.util.Scanner;

class Delivery{
	long over;
	long ball;
	long runs;
	String batsman;
	String bowler;    
	String nonStriker;    
	
	void deliveryDetails() {
		System.out.println("Delivery Details");
		System.out.println("Over: "+over);
		System.out.println("Ball: "+ball);
		System.out.println("Runs: "+runs);
		System.out.println("Batsman: "+batsman);
		System.out.println("Bowler : "+bowler);
		System.out.println("NonStriker: "+nonStriker);
	}

}
public class Main3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Delivery d = new Delivery();
	System.out.println("Enter the over ");
	d.over = Long.parseLong(sc.nextLine());
	System.out.println("Enter the ball ");
	d.ball = Long.parseLong(sc.nextLine());
	System.out.println("Enter the runs ");
	d.runs = Long.parseLong(sc.nextLine());
	
	System.out.println("Enter the Batsman Name: ");
	d.batsman = sc.nextLine();
	System.out.println("Enter the Bowler Name: ");
	d.bowler = sc.nextLine();
	System.out.println("Enter the NonStriker: ");
	d.nonStriker = sc.nextLine();
	
	d.deliveryDetails();
}
}
