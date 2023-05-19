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
	}
	
	
	private void jobListB(Scanner in) { System.out.println("\n------------------------------------- $50,000 - $65,000 -------------------------------------\n");
	 try {
         List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListB.csv");
         formatAsTable(csvData);
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
	}
		
	
	private void jobListC(Scanner in) { System.out.println("\n------------------------------------- $65,000 - $80,000 -------------------------------------\n");
	 try {
         List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListC.csv");
         formatAsTable(csvData);
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
	}
	
	
	private void jobListD(Scanner in) { System.out.println("\n------------------------------------- $80,000 - $100,000 -------------------------------------\n");
	 try {
         List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListD.csv");
         formatAsTable(csvData);
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
	}

	
	private void jobListE(Scanner in) { System.out.println("\n------------------------------------- $100,000+ -------------------------------------\n");
	 try {
         List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingSalaryListE.csv");
         formatAsTable(csvData);
     } catch (IOException e) {
         System.err.println("An error occurred: " + e.getMessage());
     }
	}
}
