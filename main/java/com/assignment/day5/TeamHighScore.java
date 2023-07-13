package com.assignment.day5;

import java.util.Arrays;
import java.util.Scanner;

public class TeamHighScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter team name");
	    String team = sc.nextLine();
	    
	    System.out.println("Enter the number of Matches played in home ground");
		int n = Integer.parseInt(sc.nextLine());
	    int score[] = new int[n];
		for(int i=0;i<n;i++) {
			score[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Enter the number of Matches played in other ground");
		int m = Integer.parseInt(sc.nextLine());
	    int score2[] = new int[m];
		for(int i=0;i<m;i++) {
			score2[i] = Integer.parseInt(sc.nextLine());
		}
		
		int[] result = new int[n + m]; 
		System.arraycopy(score, 0, result, 0, n);  
		System.arraycopy(score2, 0, result, n, m);  
		System.out.println("Runs scored by "+team+" "+Arrays.toString(result));    

		for(int i=0;i<n+m;i++) {
			if(result[i]>200)
				System.out.println(result[i]);
		}
		
	}

}
