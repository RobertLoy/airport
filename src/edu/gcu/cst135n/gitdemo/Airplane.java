package edu.gcu.cst135n.gitdemo;
public class Airplane {
	
	private int altitude = 0;
	private Pilot pilot;
	private int distance = 0;
	
	public void goUp() {
		System.out.println("Plane is going up 100 feet");
		altitude += 100;
		System.out.println("The plane is now at " + altitude + " feet.");
	}
	
	public void moveForward() {
		System.out.println("The plan is moving");
		distance +=1;
		System.out.println("The plane is at " + distance + " miles."  );
		
	}
	
	public void addPilot() {
		pilot = new Pilot();
		pilot.setfName("Han");
		pilot.setLname(" Solo");
	}

	@Override
	public String toString() {
		return "Airplane [altitude=" + altitude + ", pilot=" + pilot + "]";
	}


}
