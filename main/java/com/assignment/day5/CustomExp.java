package com.assignment.day5;

import java.util.Scanner;

public class CustomExp extends Exception {

	public CustomExp() {
		super();
	}

	public CustomExp(String message) {
		super(message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the player name");
	    String str = sc.nextLine();
	    
	    System.out.println("Enter the player age");
		int age = Integer.parseInt(sc.nextLine());
	    try {
	    	if(age<19) {
		    	throw new CustomExp("InvalidAgeRangeException");
		    }
		    else {
		    	System.out.println("Player name : "+str);
		    	System.out.println("Player Age : "+age);
		    }
	    }
	    catch(CustomExp ce) {
	    	System.out.println(ce);
	    }
	}

}
