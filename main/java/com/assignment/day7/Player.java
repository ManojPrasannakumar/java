package com.assignment.day7;

public class Player{
	private String name;
	private String skill; 
	private Long capNumber ;    
	   
	
	public Player(String name, String skill, Long capNumber) {
		super();
		this.name = name;
		this.capNumber = capNumber;
		this.skill = skill;
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
		return "Player [name=" + name + ", skill=" + skill + ", capNumber=" + capNumber + "]";
	}
	
}

