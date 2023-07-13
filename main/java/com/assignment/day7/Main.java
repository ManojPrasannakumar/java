package com.assignment.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numOfPlayers = Integer.parseInt(sc.nextLine());
        List<Player> l=new ArrayList<>();
        
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Enter the player name");
            String name = sc.nextLine();
            System.out.println("Enter the cap number");
            Long capnum = Long.parseLong(sc.nextLine());
            System.out.println("Enter the skill");
            String skill = sc.nextLine();
            l.add(new Player(name, skill, capnum));
        }
        
        Collections.sort(l, new CapComparator());
    	System.out.println("Player list after sorting by cap number in descending order");        
        for(Player p:l) {
        	System.out.println(p);
        }
    }
}
