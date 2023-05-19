package com.skillstorm.beans;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skillstorm.CSVWriter;
import com.skillstorm.JobsRUs;

public class Location extends CSVWriter {

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
		if (JobsRUs.isSignIn() == true) {
			String west;
			do {
				System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
							     + "\n\nA. Clinic Medical Assistant"
							     + "\nB. Computer Support Technician"
							     + "\nC. General Sales Manager"
							     + "\nD. Supervisory Mechanical Engineer"
							     + "\nE. Return to the Job Selection homescreen"); 
				west = in.nextLine();
			
			} while (!west.equalsIgnoreCase("A") && !west.equalsIgnoreCase("B") 
			 	  && !west.equalsIgnoreCase("C") && !west.equalsIgnoreCase("D") && !west.equalsIgnoreCase("E"));
		
			if (west.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Clinic Medical Assistant role!"); // try catch
				loopPrompt(in);
			} else  if (west.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the Computer Support Technician role!");
				loopPrompt(in);
			} else  if (west.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the General Sales Manager role!");
				loopPrompt(in);
			} else if (west.equalsIgnoreCase("D")) {
				System.out.println("Congratulations you have officially applied for the Supervisory Mechanical Engineer  role!");
				loopPrompt(in);
			} else {
				JobsRUs.jobSelection(in);
			}
		} else {
			JobsRUs.jobSelection(in);
		}
	
	}
	
	public void midwest(Scanner in) {System.out.println("\n------------------------------------- Midwest -------------------------------------\n");
	 	try {
	 		List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingMidwest.csv");
	 		formatAsTable(csvData);
    	} catch (IOException e) {
    		System.err.println("An error occurred: " + e.getMessage());
    	}
	 	if (JobsRUs.isSignIn() == true) {
	 		String midwest;
	 		do {
	 			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
	 							 + "\n\nA. Electrical Engineer - Entry Level"
	 							 + "\nB. Financial Analyst"
	 							 + "\nC. Senior Software Engineer" 
	 							 + "\nD. Used Truck Sales Representativ"
	 							 + "\nE. Return to the Job Selection homescreen"); 
				midwest = in.nextLine();
			
	 		} while (!midwest.equalsIgnoreCase("A") && !midwest.equalsIgnoreCase("B") 
				  && !midwest.equalsIgnoreCase("C") && !midwest.equalsIgnoreCase("D") && !midwest.equalsIgnoreCase("E"));
		
	 		if (midwest.equalsIgnoreCase("A")) {
	 			System.out.println("Congratulations you have officially applied for the Electrical Engineer - Entry Level role!");
	 			loopPrompt(in);
	 		} else  if (midwest.equalsIgnoreCase("B")) {
	 			System.out.println("Congratulations you have officially applied for the Financial Analyst role!");
	 			loopPrompt(in);
	 		} else  if (midwest.equalsIgnoreCase("C")) {
	 			System.out.println("Congratulations you have officially applied for the Senior Software Engineer role!");
	 			loopPrompt(in);
	 		} else if (midwest.equalsIgnoreCase("D")) {
	 			System.out.println("Congratulations you have officially applied for the Used Truck Sales Representativ role!");
	 			loopPrompt(in);
	 		} else {
	 			JobsRUs.jobSelection(in);
	 		}
	 	} else {
			JobsRUs.jobSelection(in);
		}
	}

	
	public void southwest(Scanner in) {System.out.println("\n------------------------------------- Southwest -------------------------------------\n");
	 	try {
	 		List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSouthwest.csv");
	 		formatAsTable(csvData);
	 	} catch (IOException e) {
	 		System.err.println("An error occurred: " + e.getMessage());
	 	}
	 	if (JobsRUs.isSignIn() == true) {
	 		String southwest;
	 		do {
	 			System.out.println("\nPlease choose A, B, or C for the job you would like to apply to: "
	 							 + "\n\nA. Community Health Worker" 
	 							 + "\nB. Deposit Support Specialist"
	 							 + "\nC. Physical Therapist"
	 							 + "\nD. Return to the Job Selection homescreen"); 
				southwest = in.nextLine();
			
	 		} while (!southwest.equalsIgnoreCase("A") && !southwest.equalsIgnoreCase("B") 
	 			  && !southwest.equalsIgnoreCase("C") && !southwest.equalsIgnoreCase("D"));
		
	 		if (southwest.equalsIgnoreCase("A")) {
	 			System.out.println("Congratulations you have officially applied for the Community Health Worker role!");
	 			loopPrompt(in);
	 		} else  if (southwest.equalsIgnoreCase("B")) {
	 			System.out.println("Congratulations you have officially applied for the Deposit Support Specialist role!");
	 			loopPrompt(in);
	 		} else  if (southwest.equalsIgnoreCase("C")) {
	 			System.out.println("Congratulations you have officially applied for the Physical Therapist role!");
	 			loopPrompt(in);
	 		} else {
	 			JobsRUs.jobSelection(in);
	 		}
	 	} else {
			JobsRUs.jobSelection(in);
		}
	}

	
	public void southeast(Scanner in) {System.out.println("\n------------------------------------- Southeast -------------------------------------\n");
	 	try {
	 		List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSoutheast.csv");
	 		formatAsTable(csvData);
	 	} catch (IOException e) {
	 		System.err.println("An error occurred: " + e.getMessage());
	 	}
	 	if (JobsRUs.isSignIn() == true) {
	 		String southeast;
	 		do {
	 			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
	 							 + "\n\nA. Entry Level Solar Sales Representative"
	 							 + "\nB. Finance Director"
	 							 + "\nC. Network Engineer - 1" 
	 							 + "\nD. Psychiatric Nurse Practitioner"
	 							 + "\nE. Return to the Job Selection homescreen"); 
				southeast = in.nextLine();
			
	 		} while (!southeast.equalsIgnoreCase("A") && !southeast.equalsIgnoreCase("B") 
			 	  && !southeast.equalsIgnoreCase("C") && !southeast.equalsIgnoreCase("D") && !southeast.equalsIgnoreCase("E"));
		
	 		if (southeast.equalsIgnoreCase("A")) {
	 			System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
	 			loopPrompt(in);
	 		} else  if (southeast.equalsIgnoreCase("B")) {
	 			System.out.println("Congratulations you have officially applied for the Finance Director role!");
	 			loopPrompt(in);
	 		} else  if (southeast.equalsIgnoreCase("C")) {
	 			System.out.println("Congratulations you have officially applied for the Network Engineer - 1 role!");
	 			loopPrompt(in);
	 		} else if (southeast.equalsIgnoreCase("D")) {
	 			System.out.println("Congratulations you have officially applied for the Psychiatric Nurse Practitioner role!");
	 			loopPrompt(in);
	 		} else {
	 			JobsRUs.jobSelection(in);
	 		}
	 	} else {
			JobsRUs.jobSelection(in);
		}
	}

	
	public void northeast(Scanner in) {System.out.println("\n------------------------------------- Northeast -------------------------------------\n");
	 	try {
	 		List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingNortheast.csv");
	 		formatAsTable(csvData);
	 	} catch (IOException e) {
	 		System.err.println("An error occurred: " + e.getMessage());
	 	}
	 	if (JobsRUs.isSignIn() == true) {
	 		String northeast;
	 		do {
	 			System.out.println("\nPlease choose A, B, C, D, or E for the job you would like to apply to: "
	 							 + "\n\nA. Automotive Sales Consultant"
	 							 + "\nB. Desktop Support Technician"
	 							 + "\nC. Financial Compliance Manager"
	 							 + "\nD. Machine Learning Engineer" 
	 							 + "\nE. Nuclear Engineer - Mid Level"
	 							 + "\nF. Return to the Job Selection homescreen"); 
				northeast = in.nextLine();
			
	 		} while (!northeast.equalsIgnoreCase("A") && !northeast.equalsIgnoreCase("B") 
				  && !northeast.equalsIgnoreCase("C") && !northeast.equalsIgnoreCase("D") 
				  && !northeast.equalsIgnoreCase("E") && !northeast.equalsIgnoreCase("F"));
		
	 		if (northeast.equalsIgnoreCase("A")) {
	 			System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
	 			loopPrompt(in);
	 		} else  if (northeast.equalsIgnoreCase("B")) {
	 			System.out.println("Congratulations you have officially applied for the Desktop Support Technician role!");
	 			loopPrompt(in);
	 		} else  if (northeast.equalsIgnoreCase("C")) {
	 			System.out.println("Congratulations you have officially applied for the Financial Compliance Manager role!");
	 			loopPrompt(in);
	 		} else  if (northeast.equalsIgnoreCase("D")) {
	 			System.out.println("Congratulations you have officially applied for the Machine Learning Engineer role!");
	 			loopPrompt(in);
	 		}else if (northeast.equalsIgnoreCase("E")) {
	 			System.out.println("Congratulations you have officially applied for the Nuclear Engineer - Mid Level role!");
	 			loopPrompt(in);
	 		} else {
	 			JobsRUs.jobSelection(in);
	 		}
	 	} else {
			JobsRUs.jobSelection(in);
		}
	}
}
