package com.assignment.day7;

public class Match{
	private String name;
	private Long numberOfMatches ;    
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(Long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	@Override
	public String toString() {
		return "Match [name=" + name + ", numberOfMatches=" + numberOfMatches + "]";
	}

	public Match(String name, Long numberOfMatches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMatches;
	}		
}
