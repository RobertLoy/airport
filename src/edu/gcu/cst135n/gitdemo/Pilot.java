package edu.gcu.cst135n.gitdemo;

public class Pilot {
	
	private String fName;
	private String lname;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Pilot: " + fName + " " + lname;
	}
	
}
