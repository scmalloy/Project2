package com.skillstorm.beans;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skillstorm.CSVWriter;
import com.skillstorm.JobsRUs;

public class PayRange extends CSVWriter{

	public void payRange(Scanner in) {
		
		String payRange;
		System.out.println("\n-------------------------------------------------------------------------------------------\n");
		
		do {
			System.out.println("Please choose your desired pay range: "
					+ "\nA. $35,000 - $50,000"
					+ "\nB. $50,000 - $65,000"
					+ "\nC. $65,000 - $80,000"
					+ "\nD. $80,000 - $100,000"
					+ "\nE. $100,000+");
			payRange = in.nextLine();
			System.out.println("---------------------------------{ processing........ }---------------------------------\n");
		} while (!payRange.equalsIgnoreCase("A") && !payRange.equalsIgnoreCase("B") 
				&& !payRange.equalsIgnoreCase("C") && !payRange.equalsIgnoreCase("D") && !payRange.equalsIgnoreCase("E"));
		
		if (payRange.equalsIgnoreCase("A")) {
			jobListA(in);	
		} else  if (payRange.equalsIgnoreCase("B")) {
			jobListB(in);	
		} else  if (payRange.equalsIgnoreCase("C")) {
			jobListC(in);	
		} else  if (payRange.equalsIgnoreCase("D")) {
			jobListD(in);	
		} else {
			jobListE(in);	
		}
	}

	private void jobListA(Scanner in) { System.out.println("\n------------------------------------- $35,000 - $ 50,000 -------------------------------------\n");
		try {
			List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListA.csv");
			formatAsTable(csvData);
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
		String listA;
		do {
			System.out.println("\nPlease choose A, B, C, D or E for the job you would like to apply to: "
				+ "\n\nA. Automotive Sales Consultant"); 
				System.out.println("B. Clinic Medical Assistant"); 
				System.out.println("C. Community Health Work"); 
				System.out.println("D. Deposit Support Specialist"); 
				System.out.println("E. Used Truck Sales Representative");
				System.out.println("F. Return to the Job Selection homescreen"); 
			listA = in.nextLine();
			
		} while (!listA.equalsIgnoreCase("A") && !listA.equalsIgnoreCase("B") 
				&& !listA.equalsIgnoreCase("C") && !listA.equalsIgnoreCase("D") 
				&& !listA.equalsIgnoreCase("E") && !listA.equalsIgnoreCase("F"));
		
		if (listA.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
			loopPrompt(in);
		} else  if (listA.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Clinic Medical Assistant role!");
			loopPrompt(in);
		} else  if (listA.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Community Health Work role!");
			loopPrompt(in);
		} else  if (listA.equalsIgnoreCase("D")) {
			System.out.println("Congratulations you have officially applied for the Deposit Support Specialist role!");
			loopPrompt(in);
		} else if (listA.equalsIgnoreCase("E")) {
			System.out.println("Congratulations you have officially applied for the Used Truck Sales Representative role!");
			loopPrompt(in);
		} else {
			JobsRUs.jobSelection(in);
		}
	}
	
	
	private void jobListB(Scanner in) { System.out.println("\n------------------------------------- $50,000 - $65,000 -------------------------------------\n");
	 	try {
	 		List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListB.csv");
	 		formatAsTable(csvData);
	 	} catch (IOException e) {
	 		System.err.println("An error occurred: " + e.getMessage());
	 	}
	 	String listB;
		do {
			System.out.println("\nPlease choose A, B or C for the job you would like to apply to: "
				+ "\n\nA. Computer Support Technician"); 
				System.out.println("B. Desktop Support Technician"); 
				System.out.println("C. Electrical Engineer - Entry Level"); 
				System.out.println("D. Return to the Job Selection homescreen"); 
			listB = in.nextLine();
			
		} while (!listB.equalsIgnoreCase("A") && !listB.equalsIgnoreCase("B") 
				&& !listB.equalsIgnoreCase("C") && !listB.equalsIgnoreCase("D"));
		
		if (listB.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Computer Support Technician role!");
			loopPrompt(in);
		} else  if (listB.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Desktop Support Technician role!");
			loopPrompt(in);
		} else  if (listB.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Electrical Engineer - Entry Level role!");
			loopPrompt(in);
		} else {
			JobsRUs.jobSelection(in);
		}
	}
		
	
	private void jobListC(Scanner in) { System.out.println("\n------------------------------------- $65,000 - $80,000 -------------------------------------\n");
		try {
			List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListC.csv");
			formatAsTable(csvData);
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
		String listC;
		do {
			System.out.println("\nPlease choose A, B or C for the job you would like to apply to: "
				+ "\n\nA.Entry Level Solar Sales Representative"); 
				System.out.println("B. Financial Analyst"); 
				System.out.println("C. Network Engineer - 1");
				System.out.println("D. Return to the Job Selection homescreen"); 
			listC = in.nextLine();
			
		} while (!listC.equalsIgnoreCase("A") && !listC.equalsIgnoreCase("B") 
				&& !listC.equalsIgnoreCase("C") && !listC.equalsIgnoreCase("D"));
		
		if (listC.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
			loopPrompt(in);
		} else  if (listC.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Financial Analyst role!");
			loopPrompt(in);
		} else  if (listC.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Network Engineer - 1 role!");
			loopPrompt(in);
		} else {
			JobsRUs.jobSelection(in);
		}
	}
	
	
	private void jobListD(Scanner in) { System.out.println("\n------------------------------------- $80,000 - $100,000 -------------------------------------\n");
	 	try {
	 		List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListD.csv");
	 		formatAsTable(csvData);
	 	} catch (IOException e) {
	 		System.err.println("An error occurred: " + e.getMessage());
	 	}
	 	String listD;
		do {
			System.out.println("\nPlease choose A, B, or C for the job you would like to apply to: "
				+ "\n\nA. Finance Director"); 
				System.out.println("B. Physical Therapist"); 
				System.out.println("C. Supervisory Mechanical Engineer"); 
				System.out.println("D. Return to the Job Selection homescreen"); 
			listD = in.nextLine();
			
		} while (!listD.equalsIgnoreCase("A") && !listD.equalsIgnoreCase("B") 
				&& !listD.equalsIgnoreCase("C") && !listD.equalsIgnoreCase("D"));
		
		if (listD.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Finance Director role!");
			loopPrompt(in);
		} else  if (listD.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Physical Therapist role!");
			loopPrompt(in);
		} else  if (listD.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Supervisory Mechanical Engineer role!");
			loopPrompt(in);
		} else {
			JobsRUs.jobSelection(in);
		}
	}

	// FIX EXCEPTION*****************
	private void jobListE(Scanner in) { System.out.println("\n------------------------------------- $100,000+ -------------------------------------\n");
		try {
			List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListE.csv");
			formatAsTable(csvData);
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
		String listE;
		do {
			System.out.println("\nPlease choose A, B, C, D, E, or F for the job you would like to apply to: "
				+ "\n\nA. Financial Compliance Manager");
				System.out.println("B. General Sales Manager"); 
				System.out.println("C. Machine Learning Engineer"); 
				System.out.println("D. Nuclear Engineer - Mid Level"); 
				System.out.println("E. Psychiatric Nurse Practitioner"); 
				System.out.println("F. Senior Software Engineer");
				System.out.println("G. Return to the Job Selection homescreen"); 
			listE = in.nextLine();
			
		} while (!listE.equalsIgnoreCase("A") && !listE.equalsIgnoreCase("B") 
				&& !listE.equalsIgnoreCase("C") && !listE.equalsIgnoreCase("D") 
				&& !listE.equalsIgnoreCase("E") && !listE.equalsIgnoreCase("F")
				&& !listE.equalsIgnoreCase("G"));
		
		if (listE.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Financial Compliance Manager role!");
			loopPrompt(in);
		} else  if (listE.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the General Sales Manager role!");
			loopPrompt(in);
		} else  if (listE.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Machine Learning Engineer role!");
			loopPrompt(in);
		} else  if (listE.equalsIgnoreCase("D")) {
			System.out.println("Congratulations you have officially applied for the Nuclear Engineer - Mid Level role!");
			loopPrompt(in);
		} else  if (listE.equalsIgnoreCase("E")) {
			System.out.println("Congratulations you have officially applied for the Psychiatric Nurse Practitioner role!");
			loopPrompt(in);
		}else if (listE.equalsIgnoreCase("F")) {
			System.out.println("Congratulations you have officially applied for the Senior Software Engineer role!");
			loopPrompt(in);
		} else {
			JobsRUs.jobSelection(in);
		}
	}
}
