package com.assignment.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MatchMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int numOfPlayers = Integer.parseInt(sc.nextLine());
        List<Match> l=new ArrayList<>();
        
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Enter the Team Name");
            String name = sc.nextLine();
            System.out.println("Enter the Number of Matches");
            Long numberOfMatches = Long.parseLong(sc.nextLine());
            l.add(new Match(name,numberOfMatches));
        }
        
        Collections.sort(l, new MatchComparator());
    	System.out.println("Player list after sorting by cap number in descending order");        
        for(Match p:l) {
        	System.out.println(p);
        }
    }
}
