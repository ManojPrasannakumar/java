package com.assignment.playerMap;

public class Player{
	private String name;
	private String skill;
	private String team;
	private Long capNumber ;    
	   

	public Player(String name, String skill, String team, Long capNumber) {
		super();
		this.name = name;
		this.skill = skill;
		this.team = team;
		this.capNumber = capNumber;
	}
	public Player(String name, String skill, String team) {
		super();
		this.name = name;
		this.skill = skill;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCapNumber() {
		return capNumber;
	}

	public void setCapNumber(Long capNumber) {
		this.capNumber = capNumber;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", skill=" + skill + ", team=" + team + "]";
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
}

