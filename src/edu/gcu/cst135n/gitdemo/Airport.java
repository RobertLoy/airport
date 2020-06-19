package edu.gcu.cst135n.gitdemo;

import java.util.Scanner;

public class Airport {

	private Airplane plane;
	private Scanner sc = new Scanner(System.in);

	public Airport() {
		plane = new Airplane();
	}

	public void flyPlane() {
		String option = "";
		plane.addPilot();
		System.out.println(plane);
		do {
			System.out.println("Do you want the plane to go up? [Y or Yes / N or No / X = Exit] ");
			option = (sc.nextLine().toUpperCase());
			if (option.equals("Y") || option.equals("YES"))
				plane.goUp();
		} while (!(option.equals("X")));
		System.out.println("Thank you for flying with us!");
	}

}
