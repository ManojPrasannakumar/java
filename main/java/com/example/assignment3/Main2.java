package com.example.assignment3;

import java.util.Scanner;

class Player{
	private String name;
	private String country;    
	private String skill;    
	
	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	@Override
	public String toString() {
		return "Name=" + name + ", Country=" + country + ", Skill=" + skill;
	}

}

class PlayerBO{ 
	public void displayAllPlayerDetails(Player[] playerList)  {
		System.out.println("Player Details");
		for(Player p:playerList) {
			System.out.println(p);
		}
	}
}

public class Main2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numOfPlayers = Integer.parseInt(sc.nextLine());
        
        Player[] players = new Player[numOfPlayers];
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Enter the player name");
            String name = sc.nextLine();
            System.out.println("Enter the country name");
            String country = sc.nextLine();
            System.out.println("Enter the skill");
            String skill = sc.nextLine();
            players[i] = new Player(name, country, skill);
        }
        PlayerBO playerBO = new PlayerBO();
        playerBO.displayAllPlayerDetails(players);
    }
}
