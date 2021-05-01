// Author Hyunggil Woo

import java.util.*;
import java.lang.Math;

public class Ch03 {
	
	public static void main (String[] args){
		// For printPowerOfN
		int base = 2;
		int power = 5;
	
	// In area, declare a local variable radius
	double radius = 5;
	
	// sphereVolume local variable
	radius = 2;
	
	// inputBirthday
	
	Scanner in = new Scanner(System.in);
	
	inputBirthday(in);
	}
	// Function prints out each power of the base up to that maximum power.
	
	public static void printPowersOfN(int base, int power) {
	
		// Outer loop increases the integer of power by 1 in each increment
		
		for (int i =0; i <= power; i++) {
			
			// Enter the number of base and power here.
			int powersOfN = (int) Math.pow( base, i);
		
			System.out.print(powersOfN + " ");
			
			}
	}
	
	public static double area(double radius) {
	
	// Square a number with radius
	double square = Math.PI* Math.pow(radius, 2); {
	
	return square;
	}
	
	}
	
	// Computes the volume of a sphere.
	public static double sphereVolume (double radius) {
	
		double sphereVolume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
		
		return sphereVolume;
		}
	
	public static void inputBirthday(Scanner console) {
	
	
	
	// obtain values
	
	System.out.println("On what day of the month were you born?");
	int day = console.nextInt();
	
	System.out.println("What is the name of the month in which you were born?");
	String month = console.next();
	
	System.out.println("During what year were you born?");
	int year = console.nextInt();
	
	
	
	
	
	// Prints the birthdate in a suitable format
	
	System.out.println ("You were born on " + month + " " + day + ", " + year + ". " + "You're mighty old!");
	
	

}
	public static double savingsTable () {
	
	// This prints the headings of the table.
	
	System.out.println("        " + "Current" + "Interest" + "  New  " + "  New  ");
	System.out.println("        " + "Balance" + "        " + "Deposit" + "Balance");
	
	double c = 1000; //currentBalance
	double r = 6.5; //rate
	//double n = newBalance;
	double d = 1000; //deposit //(how to make deposit in a loop)
	int year = 25; 
	
	// for loop with year beginning at 1
		public static double newBalance {
		for ( int i = 1; i <= year; i++) {
	
		System.out.print( c * Math.pow((1 + r/100), i) + d);
		}
	
	}

}
}
