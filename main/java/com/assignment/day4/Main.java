package com.assignment.day4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the team details");
    String str = sc.nextLine();
    
    String[] arrOfStr = str.split("#");
    
    Team t = new Team();
    t.setName(arrOfStr[0]);
    t.setCoach(arrOfStr[1]);
    t.setLocation(arrOfStr[2]);
    t.setPlayers(arrOfStr[3]);
    t.setCaptain(arrOfStr[4]);
    
    System.out.println(t);
	}
}
