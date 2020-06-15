package edu.gcu.cst135n.gitdemo;

public class Pilot {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pilot [name=" + name + "]";
	}
	
}
