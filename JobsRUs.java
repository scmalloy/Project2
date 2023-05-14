package com.skillstorm;

import java.util.Scanner;

import com.skillstorm.beans.Field;
import com.skillstorm.beans.Jobs;
import com.skillstorm.beans.Location;
import com.skillstorm.beans.PayRange;

public class JobsRUs extends Jobs {

	public static void main(String[] args) {
		jobSelection();
	
		
	}

	

// OtherClass other = new OtherClass(); other.someMethod();


public static void jobSelection() {
	// To call to the 
	// Field field = new Field();
	// field.field();
	Scanner in = new Scanner(System.in); 
	String selectionType;
	
	do {
		System.out.println("\n*********Job Selection*********");
		System.out.println("Please choose how you would like to filter your job search: "
				+ "\nA.) All jobs"
				+ "\nB.) By pay range"
				+ "\nC.) By location"
				+ "\nD.) By job field");
			selectionType = in.nextLine();
		
		System.out.println("\n*********************************{ processing........ }*********************************\n");
	} while (!selectionType.equalsIgnoreCase("A") && !selectionType.equalsIgnoreCase("B") 
			&& !selectionType.equalsIgnoreCase("C") && !selectionType.equalsIgnoreCase("D"));
	
	if (selectionType.equalsIgnoreCase("A")) {
		Jobs job = new Jobs();
		job.allJobs();
	} else  if (selectionType.equalsIgnoreCase("B")) {
		PayRange pay = new PayRange();
		pay.payRange();
	} else  if (selectionType.equalsIgnoreCase("C")) {
		Location loc = new Location();
		loc.location();
	} else {
		Field field = new Field();
		field.field();
	}
	
}


}
