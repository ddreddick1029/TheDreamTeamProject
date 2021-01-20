package application;

import java.util.Scanner;

public class GetNames {
	Scanner scan = new Scanner(System.in);
	
	public String green_wrestler;
	public String red_wrestler;
	
	public void askForNames() {
	System.out.println("Enter Red Wrestler:");//asks for the 
	red_wrestler = scan.nextLine();
	System.out.println("Enter Green Wrestler:");
	green_wrestler = scan.nextLine();
	}
	
	public String getRed() {
		return red_wrestler;
	}
	
	public String getGreen() {
		return green_wrestler;
	}
}
