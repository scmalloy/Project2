package com.skillstorm.beans;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skillstorm.Account;
import com.skillstorm.CSVWriter;
import com.skillstorm.JobsRUs;

public class Field extends CSVWriter {
	
	public void field(Scanner in) {
		
		
		String jobType;
		System.out.println("\n-------------------------------------------------------------------------------------------\n");
		
		do {
			System.out.println("Please choose the career field you are interested in: "
					+ "\nA. Engineering"
					+ "\nB. Sales"
					+ "\nC. Finance"
					+ "\nD. Computer and Information Technology"
					+ "\nE. Healthcare");
			jobType = in.nextLine();
			
			System.out.println("--------------------------------- { processing........ } ---------------------------------\n");
		} while (!jobType.equalsIgnoreCase("A") && !jobType.equalsIgnoreCase("B") 
				&& !jobType.equalsIgnoreCase("C") && !jobType.equalsIgnoreCase("D") && !jobType.equalsIgnoreCase("E"));
		
		if (jobType.equalsIgnoreCase("A")) {
			engineering(in);
		} else  if (jobType.equalsIgnoreCase("B")) {
			sales(in);
		} else  if (jobType.equalsIgnoreCase("C")) {
			finance(in);
		} else  if (jobType.equalsIgnoreCase("D")) {
			computerIT(in);
		} else {
			healthcare(in);
		} 
	}



	public void engineering(Scanner in) {
		System.out.println("----------------------------------- Engineering -----------------------------------\n");
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingEngineering.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
		 if (JobsRUs.isSignIn() == true) {
			 String eng;
			 do {
				 System.out.println("\nPlease choose A, B, C, or D for the Engineering job you would like to apply to: "
						 		  + "\n\nA. Electrical Engineer - Entry Level"
						 		  + "\nB. Network Engineer - 1"
						 		  + "\nC. Nuclear Engineer - Mid Level"
						 		  + "\nD. Supervisory Mechanical Engineer"
						 		  + "\nE. Return to the Job Selection homescreen"); 
				eng = in.nextLine();
				
			} while (!eng.equalsIgnoreCase("A") && !eng.equalsIgnoreCase("B") 
		   		  && !eng.equalsIgnoreCase("C") && !eng.equalsIgnoreCase("D") && !eng.equalsIgnoreCase("E"));
			
			if (eng.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Electrical Engineer - Entry Level role!");
				Account.addToApp("Electrical Engineer - Entry Level");
				loopPrompt(in);
			} else  if (eng.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the Network Engineer - 1 role!");
				Account.addToApp("Network Engineer - 1");
				loopPrompt(in);
			} else  if (eng.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the Nuclear Engineer - Mid Level role!");
				Account.addToApp("Nuclear Engineer - Mid Level");
				loopPrompt(in);
			} else if (eng.equalsIgnoreCase("D")) {
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
	
	
	public void sales(Scanner in) {
		System.out.println("------------------------------------ Sales -------------------------------------\n");
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSales.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
		 if (JobsRUs.isSignIn() == true) {
		 String sales;
			do {
				System.out.println("\nPlease choose A, B, C, or D the Sales job you would like to apply to: "
								 + "\n\nA. Automotive Sales Consultant"
								 + "\nB. Entry Level Solar Sales Representative"
								 + "\nC. General Sales Manager"
								 + "\nD. Used Truck Sales Representative" 
								 + "\nE. Return to the Job Selection homescreen"); 
				sales = in.nextLine();
				
			} while (!sales.equalsIgnoreCase("A") && !sales.equalsIgnoreCase("B") 
				  && !sales.equalsIgnoreCase("C") && !sales.equalsIgnoreCase("D") && !sales.equalsIgnoreCase("E"));
			
			if (sales.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
				Account.addToApp("Automotive Sales Consultant");
				loopPrompt(in);
			} else  if (sales.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
				Account.addToApp("Entry Level Solar Sales Representative");
				loopPrompt(in);
			} else  if (sales.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the General Sales Manager role!");
				Account.addToApp("General Sales Manager");
				loopPrompt(in);
			} else if (sales.equalsIgnoreCase("D")){
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
	
	
	public void finance(Scanner in) {
		System.out.println("------------------------------------- Finance -------------------------------------\n");
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingFinance.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
		 if (JobsRUs.isSignIn() == true) {
		 String fin;
			do {
				System.out.println("\nPlease choose A, B, C, or D the Finance job you would like to apply to: "
								 + "\n\nA. Deposit Support Specialist" 
								 + "\nB. Finance Director"
								 + "\nC. Financial Analyst"
								 + "\nD. Financial Compliance Manager" 
								 + "\nE. Return to the Job Selection homescreen");
				fin = in.nextLine();
				
			} while (!fin.equalsIgnoreCase("A") && !fin.equalsIgnoreCase("B") 
					&& !fin.equalsIgnoreCase("C") && !fin.equalsIgnoreCase("D") && !fin.equalsIgnoreCase("E"));
			
			if (fin.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Deposit Support Specialist role!");
				Account.addToApp("Deposit Support Specialist");
				loopPrompt(in);
			} else  if (fin.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the Finance Director role!");
				Account.addToApp("Finance Director");
				loopPrompt(in);
			} else  if (fin.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the Financial Analyst role!");
				Account.addToApp("Financial Analyst");
				loopPrompt(in);
			} else if (fin.equalsIgnoreCase("D")) {
				System.out.println("Congratulations you have officially applied for the Financial Compliance Manager role!");
				Account.addToApp("Financial Compliance Manager");
				loopPrompt(in);
			} else {
				JobsRUs.jobSelection(in);
			}
		 } else {
				JobsRUs.jobSelection(in);
		}
	}
	
	
	public void computerIT(Scanner in) {
		System.out.println("------------------------------------- Computer and Information Technology -------------------------------------\n");
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingComputerIT.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
		 if (JobsRUs.isSignIn() == true) {
		 String compIT;
			do {
				System.out.println("\nPlease choose A, B, C, or D the Computer and Information Technology job you would like to apply to: "
								 + "\n\nA. Computer Support Technician"
								 + "\nB. Desktop Support Technician"
								 + "\nC. Machine Learning Engineer" 
								 + "\nD. Senior Software Engineer"
								 + "\nE. Return to the Job Selection homescreen"); 
				compIT = in.nextLine();
				
			} while (!compIT.equalsIgnoreCase("A") && !compIT.equalsIgnoreCase("B") 
					&& !compIT.equalsIgnoreCase("C") && !compIT.equalsIgnoreCase("D") && !compIT.equalsIgnoreCase("E"));
			
			if (compIT.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Computer Support Technician role!");
				Account.addToApp("Computer Support Technician");
				loopPrompt(in);
			} else  if (compIT.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the Desktop Support Technician role!");
				Account.addToApp("Desktop Support Technician");
				loopPrompt(in);
			} else  if (compIT.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the Machine Learning Engineer role!");
				Account.addToApp("Machine Learning Engineer");
				loopPrompt(in);
			} else  if (compIT.equalsIgnoreCase("D")) {
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
	
	
	public void healthcare(Scanner in) {
		System.out.println("------------------------------------- Healthcare -------------------------------------\n");
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingHealthcare.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
		 if (JobsRUs.isSignIn() == true) {
		 String health;
			do {
				System.out.println("\nPlease choose A, B, C, or D the Healthcare job you would like to apply to: "
								 + "\n\nA. Clinic Medical Assistant"
								 + "\nB. Community Health Worker"
								 + "\nC. Physical Therapist"
								 + "\nD. Psychiatric Nurse Practitioner"
								 + "\nE. Return to the Job Selection homescreen"); 
				health = in.nextLine();
				
			} while (!health.equalsIgnoreCase("A") && !health.equalsIgnoreCase("B") 
					&& !health.equalsIgnoreCase("C") && !health.equalsIgnoreCase("D") && !health.equalsIgnoreCase("E"));
			
			if (health.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Clinic Medical Assistant role!");
				Account.addToApp("Clinic Medical Assistant");
				loopPrompt(in);
			} else  if (health.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the Community Health Worker role!");
				Account.addToApp("Community Health Worker");
				loopPrompt(in);
			} else  if (health.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the Physical Therapist role!");
				Account.addToApp("Physical Therapist");
				loopPrompt(in);
			} else if (health.equalsIgnoreCase("D")) {
				System.out.println("Congratulations you have officially applied for the Psychiatric Nurse Practitioner role!");
				Account.addToApp("Psychiatric Nurse Practitioner");
				loopPrompt(in);
			} else {
				JobsRUs.jobSelection(in);
			}
		 } else {
				JobsRUs.jobSelection(in);
		 }
	}
}
