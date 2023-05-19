package com.skillstorm.beans;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skillstorm.CSVWriter;
import com.skillstorm.JobsRUs;

public class Field extends CSVWriter{
	
	// ****** FIX THE SCANNER *****
	
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
			
			System.out.println("---------------------------------{ processing........ }---------------------------------\n");
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
		 String eng;
			do {
				System.out.println("\nPlease choose A, B, C, or D for the Engineering job you would like to apply to: "
					+ "\n\nA. Supervisory Mechanical Engineer"); 
					System.out.println("B. Network Engineer - 1"); 
					System.out.println("C. Electrical Engineer - Entry Level"); 
					System.out.println("D. Nuclear Engineer - Mid Level"); 
					System.out.println("E. Return to the Job Selection homescreen"); 
				eng = in.nextLine();
				
			} while (!eng.equalsIgnoreCase("A") && !eng.equalsIgnoreCase("B") 
					&& !eng.equalsIgnoreCase("C") && !eng.equalsIgnoreCase("D") && !eng.equalsIgnoreCase("E"));
			
			if (eng.equalsIgnoreCase("A")) {
				System.out.println("Congratulations you have officially applied for the Supervisory Mechanical Engineer role!");
				loopPrompt(in);
			} else  if (eng.equalsIgnoreCase("B")) {
				System.out.println("Congratulations you have officially applied for the Network Engineer - 1 role!");
				loopPrompt(in);
			} else  if (eng.equalsIgnoreCase("C")) {
				System.out.println("Congratulations you have officially applied for the Electrical Engineer - Entry Level role!");
				loopPrompt(in);
			} else if (eng.equalsIgnoreCase("D")) {
				System.out.println("Congratulations you have officially applied for the Nuclear Engineer - Mid Level role!");
				loopPrompt(in);
			} else {
				JobsRUs.jobSelection(in);
			}

	}
	
	
	public void sales(Scanner in) {
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSales.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
	}
	
	
	public void finance(Scanner in) {
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingFinance.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
	}
	
	
	public void computerIT(Scanner in) {
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingComputerIT.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
	}
	
	
	public void healthcare(Scanner in) {
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingHealthcare.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
	}
	
	public void loopPrompt(Scanner in) {
		
		String yesorno;
		do {
			System.out.println("\nWould you like to apply to another job?"
				+ "\nChoose Y to return to the Job Selection screen or N to end your session.");
			yesorno = in.nextLine();
		} while (!yesorno.equalsIgnoreCase("Y") && !yesorno.equalsIgnoreCase("N"));
	
		if(yesorno.equalsIgnoreCase("Y")) {
			JobsRUs.jobSelection(in);
		} else {
			System.out.println("This concludes your job application!");
		}
	}
}
