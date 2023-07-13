package com.assignment.day4;

import java.util.Scanner;

class Player{
	String fName;
	String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
}

public class ComPlayerName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player Names");
		String p1 = sc.nextLine();
		String p2 = sc.nextLine();
		
	    String[] arr = p1.split(" ");
	    String[] arr2 = p2.split(" ");
	    
	    if(arr[1].equalsIgnoreCase(arr[1]))
	    	System.out.println("Yes");
	    else
	    	System.out.println("No");
	}
}
