package com.assignment.playerMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PlayerMapMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numOfPlayers = Integer.parseInt(sc.nextLine());
        List<Player> l=new ArrayList<>();
        Long capnum;
        TreeMap<Long,Player> tm=new TreeMap<>();
        
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Enter the player name");
            String name = sc.nextLine();
            System.out.println("Enter the team name");
            String team = sc.nextLine();
            System.out.println("Enter the cap number");
            capnum= Long.parseLong(sc.nextLine());
            System.out.println("Enter the skill");
            String skill = sc.nextLine();
            l.add(new Player(name, skill, team));
            tm.put(capnum, new Player(name, skill, team));
        }   
        Collections.sort(l, new CapComparator());
       
		/*
		 * System.out.
		 * println("Player list after sorting by cap number in descending order");
		 * for(Player p:l) { System.out.println(p); }
		 */
        Set set=tm.entrySet(); 
        Iterator i=set.iterator();
        set=tm.keySet();
        i=set.iterator();
        while(i.hasNext()) {
            Long i1=(Long) i.next();
            System.out.println(i1+" "+tm.get(i1));
        }
    }
}
