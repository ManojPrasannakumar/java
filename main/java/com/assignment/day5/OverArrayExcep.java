package com.assignment.day5;

import java.util.Scanner;

public class OverArrayExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of overs");
	    int numOfOvers = 0;
	    try{
	    	numOfOvers = Integer.parseInt(sc.nextLine());
	    }
	    catch(NegativeArraySizeException e){
	    	System.out.println(e);
	    }
	    System.out.println("Enter the number of runs for each over");
	    int runs[] = new int[numOfOvers];
	    for(int i=0;i<numOfOvers;i++) {
	    	runs[i] = Integer.parseInt(sc.nextLine());
	    }
	    
	    System.out.println("Enter the over number");
	    try {
	    	int a= Integer.parseInt(sc.nextLine());
		    System.out.println("Runs scored in this over : "+runs[a-1]);
	    }
	    catch(ArrayIndexOutOfBoundsException ae){
	    	System.out.println(ae);
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
	    
	}

}
