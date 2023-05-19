package com.skillstorm.beans;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skillstorm.CSVWriter;
import com.skillstorm.JobsRUs;

public class Location extends CSVWriter{

	public void location(Scanner in) {
		
		String location;
		System.out.println("\n-------------------------------------------------------------------------------------------\n");
		
		
		do {
			System.out.println("Please choose your desired location: "
					+ "\nA. West"
					+ "\nB. Midwest"
					+ "\nC. Southwest"
					+ "\nD. Southeast"
					+ "\nE. Northeast");
			location = in.nextLine();
			
			System.out.println("---------------------------------{ processing........ }---------------------------------\n");
		} while (!location.equalsIgnoreCase("A") && !location.equalsIgnoreCase("B") 
				&& !location.equalsIgnoreCase("C") && !location.equalsIgnoreCase("D") && !location.equalsIgnoreCase("E"));
		
		if (location.equalsIgnoreCase("A")) {
			west(in);	
		} else  if (location.equalsIgnoreCase("B")) {
			midwest(in);	
		} else  if (location.equalsIgnoreCase("C")) {
			southwest(in);	
		} else  if (location.equalsIgnoreCase("D")) {
			southeast(in);	
		} else {
			northeast(in);	
		}

	}

	public void west(Scanner in) { System.out.println("\n------------------------------------- West -------------------------------------\n");
	 try {
         List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingWest.csv");
         formatAsTable(csvData);
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
	
	}
	
	public void midwest(Scanner in) {System.out.println("\n------------------------------------- Midwest -------------------------------------\n");
	 try {
         List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingMidwest.csv");
         formatAsTable(csvData);
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
	}

	
	public void southwest(Scanner in) {System.out.println("\n------------------------------------- Southwest -------------------------------------\n");
	 try {
         List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSouthwest.csv");
         formatAsTable(csvData);
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
	}

	
	public void southeast(Scanner in) {System.out.println("\n------------------------------------- Southeast -------------------------------------\n");
	 try {
         List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSoutheast.csv");
         formatAsTable(csvData);
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
	}

	
	public void northeast(Scanner in) {System.out.println("\n------------------------------------- Northeast -------------------------------------\n");
	 try {
         List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingNortheast.csv");
         formatAsTable(csvData);
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
	}
}
