// Author Hyunggil Woo

import java.util.*;
import java.lang.Math;

public class Ch03 {
	
	public static void main (String[] args){
	
	}
	// Function prints out each power of the base up to that maximum power.
	
	public static void PrintPowersOfN() {
	
		
		int base = 2;
		int power = 5;
		
		// Enter the number of base and power here.
		int powerOfN = (int) Math.pow( base, power);
		
		// Outer loop increases the integer of power by 1 in each increment
		
		for (int i =0; i <= power; i++) {
			
			System.out.print (powerOfN);
			
			}
	}
	
	public static void area() {
	
	//Declare a local variable radius
	double radius = 5;
	
	// Square a number with radius
	double square = Math.PI* Math.pow(radius, 2); {
	
	
	
	System.out.print(square);
	}
	
	}
	
	public static double sphereVolume (double radius) {
	
	radius = 2;
		return 4 / 3 * Math.PI * Math.pow(radius, 3);
		}
	
	public static void inputBirthday() {
	
	Scanner console = new Scanner (System.in);
	
	// obtain values
	
	System.out.print ("On what day of the month were you born?");
	int day = console.nextInt();
	
	System.out.print("What is the name of the month in which you were born?");
	String month = console.next();
	
	System.out.print("During what year were you born?");
	int year = console.nextInt ();
	
	// Prints the birthdate in a suitable format
	
	System.out.println ("You were born on " + month + day + "," + year + "." + "You are mighty old!");
	
	

}

}