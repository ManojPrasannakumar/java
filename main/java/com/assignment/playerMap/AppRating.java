package com.assignment.playerMap;

import java.util.Scanner;

public class AppRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the Matches played");
		int n = Integer.parseInt(sc.nextLine());
		int score[] = new int[n];
		if(n<0) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println("Enter the Rating");
			for(int i=0;i<n;i++) {
				score[i] = Integer.parseInt(sc.nextLine());
			}
			System.out.println(isRating(score));
		}
		
	}
	
	static int isRating(int[] array) {
		int count=0;
	    for (int i = 0; i < array.length; i++) {  	
	        if (array[i] > 0) {
	            count++;
	    	}
	    	else{
	    		count=0;
	    	}
	    }return count;
	}
}