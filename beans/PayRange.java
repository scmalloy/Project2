package com.skillstorm.beans;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skillstorm.CSVWriter;
import com.skillstorm.JobsRUs;
import com.skillstorm.Account;

public class PayRange extends CSVWriter {

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
			System.out.println("--------------------------------- { processing........ } ---------------------------------\n");
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
		if (JobsRUs.isSignIn() == true) {
			String listA;
			do {
				System.out.println("\nPlease choose A, B, C, D or E for the job you would like to apply to: "
								+ "\n\nA. Automotive Sales Consultant" 
								+ "\nB. Clinic Medical Assistant"
								+ "\nC. Community Health Worker"
								+ "\nD. Deposit Support Specialist"
								+ "\nE. Used Truck Sales Representative"
								+ "\nF. Return to the Job Selection homescreen");
				listA = in.nextLine();
			
			} while (!listA.equalsIgnoreCase("A") && !listA.equalsIgnoreCase("B") 
			   	  && !listA.equalsIgnoreCase("C") && !listA.equalsIgnoreCase("D") 
				  && !listA.equalsIgnoreCase("E") && !listA.equalsIgnoreCase("F"));
		
			if (listA.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
				Account.addToApp("Automotive Sales Consultant");
				loopPrompt(in);
			} else  if (listA.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the Clinic Medical Assistant role!");
				Account.addToApp("Clinic Medical Assistant");
				loopPrompt(in);
			} else  if (listA.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the Community Health Worker role!");
				Account.addToApp("Community Health Worker");
				loopPrompt(in);
			} else  if (listA.equalsIgnoreCase("D")) {
				System.out.println("Congratulations you have officially applied for the Deposit Support Specialist role!");
				Account.addToApp("Deposit Support Specialist");
				loopPrompt(in);
			} else if (listA.equalsIgnoreCase("E")) {
				System.out.println("Congratulations you have officially applied for the Used Truck Sales Representative role!");
				Account.addToApp("Used Truck Sales Representative");
				loopPrompt(in);
			} else {
				JobsRUs.jobSelection(in);
			}
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
	 	if (JobsRUs.isSignIn() == true) {
	 		String listB;
	 		do {
	 			System.out.println("\nPlease choose A, B or C for the job you would like to apply to: "
	 					         + "\n\nA. Computer Support Technician" 
	 					         + "\nB. Desktop Support Technician"
	 					         + "\nC. Electrical Engineer - Entry Level" 
	 					         + "\nD. Return to the Job Selection homescreen"); 
				listB = in.nextLine();
			
	 		} while (!listB.equalsIgnoreCase("A") && !listB.equalsIgnoreCase("B") 
	 				&& !listB.equalsIgnoreCase("C") && !listB.equalsIgnoreCase("D"));
		
	 		if (listB.equalsIgnoreCase("A")) {
	 			System.out.println("Congratulations you have officially applied for the Computer Support Technician role!");
	 			Account.addToApp("Computer Support Technician");
	 			loopPrompt(in);
	 		} else  if (listB.equalsIgnoreCase("B")) {
	 			System.out.println("Congratulations you have officially applied for the Desktop Support Technician role!");
	 			Account.addToApp("Desktop Support Technician");
	 			loopPrompt(in);
	 		} else if (listB.equalsIgnoreCase("C")) {
	 			System.out.println("Congratulations you have officially applied for the Electrical Engineer - Entry Level role!");
	 			Account.addToApp("Electrical Engineer - Entry Level");
	 			loopPrompt(in);
	 		} else {
	 			JobsRUs.jobSelection(in);
	 		}
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
		if (JobsRUs.isSignIn() == true) {
			String listC;
			do {
				System.out.println("\nPlease choose A, B or C for the job you would like to apply to: "
						         + "\n\nA.Entry Level Solar Sales Representative" 
						         + "\nB. Financial Analyst"
						         + "\nC. Network Engineer - 1"
						         + "\nD. Return to the Job Selection homescreen"); 
				listC = in.nextLine();
			
			} while (!listC.equalsIgnoreCase("A") && !listC.equalsIgnoreCase("B") 
				  && !listC.equalsIgnoreCase("C") && !listC.equalsIgnoreCase("D"));
		
			if (listC.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
				Account.addToApp("Entry Level Solar Sales Representative");
				loopPrompt(in);
			} else  if (listC.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the Financial Analyst role!");
				Account.addToApp("Financial Analyst");
				loopPrompt(in);
			} else  if (listC.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the Network Engineer - 1 role!");
				Account.addToApp("Network Engineer - 1");
				loopPrompt(in);
			} else {
				JobsRUs.jobSelection(in);
			}
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
	 	if (JobsRUs.isSignIn() == true) {
	 		String listD;
	 		do {
	 			System.out.println("\nPlease choose A, B, or C for the job you would like to apply to: "
	 					        + "\n\nA. Finance Director"
	 							+ "\nB. Physical Therapist"
	 							+ "\nC. Supervisory Mechanical Engineer"
	 							+ "\nD. Return to the Job Selection homescreen"); 
				listD = in.nextLine();
			
	 		} while (!listD.equalsIgnoreCase("A") && !listD.equalsIgnoreCase("B") 
			   	  && !listD.equalsIgnoreCase("C") && !listD.equalsIgnoreCase("D"));
		
	 		if (listD.equalsIgnoreCase("A")) {
	 			System.out.println("Congratulations you have officially applied for the Finance Director role!");
	 			Account.addToApp("Finance Director");
	 			loopPrompt(in);
	 		} else  if (listD.equalsIgnoreCase("B")) {
	 			System.out.println("Congratulations you have officially applied for the Physical Therapist role!");
	 			Account.addToApp("Physical Therapist");
	 			loopPrompt(in);
	 		} else  if (listD.equalsIgnoreCase("C")) {
	 			System.out.println("Congratulations you have officially applied for the Supervisory Mechanical Engineer role!");
	 			Account.addToApp("Supervisory Mechanical Engineer");
	 			loopPrompt(in);
	 		} else {
	 			JobsRUs.jobSelection(in);
	 		}
	 	} else {
			JobsRUs.jobSelection(in);
		}
	}
	
	
	private void jobListE(Scanner in) { System.out.println("\n------------------------------------- $100,000+ -------------------------------------\n");
		try {
			List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListE.csv");
			formatAsTable(csvData);
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
		if (JobsRUs.isSignIn() == true) {
			String listE;
			do {
				System.out.println("\nPlease choose A, B, C, D, E, or F for the job you would like to apply to: "
						         + "\n\nA. Financial Compliance Manager"
						         + "\nB. General Sales Manager"
						         + "\nC. Machine Learning Engineer"
						         + "\nD. Nuclear Engineer - Mid Level" 
						         + "\nE. Psychiatric Nurse Practitioner"
						         + "\nF. Senior Software Engineer"
						         + "\nG. Return to the Job Selection homescreen"); 
				listE = in.nextLine();
			
			} while (!listE.equalsIgnoreCase("A") && !listE.equalsIgnoreCase("B") 
				  && !listE.equalsIgnoreCase("C") && !listE.equalsIgnoreCase("D") 
				  && !listE.equalsIgnoreCase("E") && !listE.equalsIgnoreCase("F")
				  && !listE.equalsIgnoreCase("G"));
		
			if (listE.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Financial Compliance Manager role!");
				Account.addToApp("Financial Compliance Manager");
				loopPrompt(in);
			} else  if (listE.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the General Sales Manager role!");
				Account.addToApp("General Sales Manager");
				loopPrompt(in);
			} else  if (listE.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the Machine Learning Engineer role!");
				Account.addToApp("Machine Learning Engineer");
				loopPrompt(in);
			} else  if (listE.equalsIgnoreCase("D")) {
				System.out.println("Congratulations you have officially applied for the Nuclear Engineer - Mid Level role!");
				Account.addToApp("Nuclear Engineer - Mid Level");
				loopPrompt(in);
			} else  if (listE.equalsIgnoreCase("E")) {
				System.out.println("Congratulations you have officially applied for the Psychiatric Nurse Practitioner role!");
				Account.addToApp("Psychiatric Nurse Practitioner");
				loopPrompt(in);
			} else if (listE.equalsIgnoreCase("F")) {
				System.out.println("Congratulations you have officially applied for the Senior Software Engineer role!");
				Account.addToApp("Senior Software Engineer");
				loopPrompt(in);
			} else {
				JobsRUs.jobSelection(in);
			}
		} else {
			JobsRUs.jobSelection(in);
		}
	}
}
