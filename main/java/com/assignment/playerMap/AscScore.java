package com.assignment.playerMap;

import java.util.Scanner;

public class AscScore {

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
			System.out.println("Enter the score");
			for(int i=0;i<n;i++) {
				score[i] = Integer.parseInt(sc.nextLine());
				if(score[i]<0) {
					System.out.println("Invalid Input");
				}
			}
			System.out.println(isSorted(score));
		}
	}
	
	static boolean isSorted(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] > array[i + 1])
	            return false;
	    }
	    return true;
	}
}
