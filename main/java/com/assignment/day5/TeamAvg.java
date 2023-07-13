package com.assignment.day5;

import java.util.Scanner;

public class TeamAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the Matches played by Team");
		int numOfMatches = Integer.parseInt(sc.nextLine());
	    int total = 0;
		for(int i=0;i<numOfMatches;i++) {
			int score = Integer.parseInt(sc.nextLine());
		    total+=score;
		}
		System.out.println("Total: "+total);
		System.out.println("Average: "+total/numOfMatches);
	}

}
