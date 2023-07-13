package com.assignment.day4;
import java.util.Scanner;

public class Fundas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team Name and Jersey Number");
		String str = sc.nextLine();
	    String[] arrOfStr = str.split(" ");
	    
	  	if(arrOfStr[0].matches(".*\\d.*"))
	    	System.out.println("Invalid");
	    else
	    	System.out.println("Valid");		
	}
}