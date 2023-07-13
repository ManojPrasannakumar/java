package com.assignment.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TeamNotFoundExcp extends Exception {

	public TeamNotFoundExcp() {
		super();
	}

	public TeamNotFoundExcp(String message) {
		super(message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "Chennai Super Kings",
				"Deccan Chargers",
				"Delhi Daredevils",
				"Kings XI Punjab",
				"Kolkata Knight Riders",
				"Mumbai Indians",
				"Rajasthan Royals",
				"Royal Challengers Bangalore"};
		
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		Collections.sort(arrList);
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the expected winner team of IPL Season");
		String team1 = sc.nextLine();
		try {
			if(!Arrays.asList(arr).contains(team1)) {
				throw new TeamNotFoundExcp(team1+" Entered team is not a part of IPL Season");
			}
		}
		catch(TeamNotFoundExcp te){
			System.out.println(te);
			System.exit(1);
		}
		
		System.out.println("Enter the expected runner team of IPL Season");
		String team2 = sc.nextLine();
		try {
			if(!Arrays.asList(arr).contains(team2)) {
				throw new TeamNotFoundExcp(team2+" Entered team is not a part of IPL Season");
			}
		}
		catch(TeamNotFoundExcp te){
			System.out.println(te);
			System.exit(1);
		}
		System.out.println("Expected IPL Season winner: "+team1);
		System.out.println("Expected IPL Season runner: "+team2);
		
	}

}
