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
	
	Scanner console = new Scanner(System.in);
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
	
	System.out.print ("On what day of the month were you born?");
	int day = console.nextInt();
	
	System.out.print("What is the name of the month in which you were born?");
	String month = console.nextLine();
	
	System.out.print("During what year were you born?");
	int year = console.nextInt();
	
	// Prints the birthdate in a suitable format
	
	System.out.println ("You were born on " + month + day + "," + year + "." + "You are mighty old!");
	
	

}

}
