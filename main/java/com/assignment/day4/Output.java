package com.assignment.day4;

import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		int numOfWickets = Integer.parseInt(sc.nextLine());
	    
	    Wicket[] w = new Wicket[numOfWickets];
        
	    System.out.println("Enter the wicket details");
	    String str = sc.nextLine();
	    
	    String[] arrOfStr = str.split(",");
	    for (int i = 0; i < numOfWickets; i++) {
	    	//w[i] = new Wicket(arrOfStr, );
		}
	    System.out.println("Player Details");
		for(Wicket wicket:w) {
			System.out.println(wicket);
		}
	}/*
		 * w[i].setOver(Long.parseLong(arrOfStr[0]));
		 * w[i].setBall(Long.parseLong(arrOfStr[1])); w[i].setWicketType(arrOfStr[2]);
		 * w[i].setPlayerName(arrOfStr[3]); w[i].setBowlerName(arrOfStr[4]);
		 */
}