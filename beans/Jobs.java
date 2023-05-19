package com.skillstorm.beans;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skillstorm.CSVWriter;


public class Jobs extends CSVWriter{

	public void allJobs(Scanner in) {
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingAlljobs.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
		 String alljobslist;
		do {
			System.out.println("Please choose the job you would like to apply to: "
					+ "\n-------------------------- Computer and Information Technology ---------------------------\n"
					+ "\nA. Computer Support Technician"); 
					System.out.println("B. Desktop Support Technician"); 
					System.out.println("C. Machine Learning Engineer"); 
					System.out.println("D. Senior Software Engineer"); 
					 System.out.println("\n-------------------------------------- Engineering ---------------------------------------\n"
					+ "\nE. Electrical Engineer - Entry Level"); 
					System.out.println("F. Network Engineer - 1"); 
					System.out.println("G. Nuclear Engineer - Mid Level"); 
					System.out.println("H. Supervisory Mechanical Engineer"); 
					System.out.println("\n----------------------------------------- Finance ------------------------------------------\n");
					System.out.println("I. Deposit Support Specialist"); 
					System.out.println("J. Finance Director"); 
					System.out.println("K. Financial Analyst"); 
					System.out.println("L. Financial Compliance Manager"); 
					System.out.println("\n---------------------------------------- Healthcare -----------------------------------------\n");
					System.out.println("M. Clinic Medical Assistant");
					System.out.println("N. Community Health Worker"); 
					System.out.println("O. Physical Therapist"); 
					System.out.println("P. Psychiatric Nurse Practitioner"); 
					System.out.println("\n--------------------------------------- Sales ---------------------------------------\n");
					System.out.println("Q. Automotive Sales Consultant"); 
					System.out.println("R. Entry Level Solar Sales Representative"); 
					System.out.println("S. General Sales Manager"); 
					System.out.println("T. Used Truck Sales Representative");	
				alljobslist = in.nextLine();
				
				System.out.println("---------------------------------{ processing........ }---------------------------------\n");
		} while (!alljobslist.equalsIgnoreCase("A") && !alljobslist.equalsIgnoreCase("B") && !alljobslist.equalsIgnoreCase("C") 
			&& !alljobslist.equalsIgnoreCase("D") && !alljobslist.equalsIgnoreCase("E") && !alljobslist.equalsIgnoreCase("F")
			&& !alljobslist.equalsIgnoreCase("G") && !alljobslist.equalsIgnoreCase("H") && !alljobslist.equalsIgnoreCase("I")
			&& !alljobslist.equalsIgnoreCase("J") && !alljobslist.equalsIgnoreCase("K") && !alljobslist.equalsIgnoreCase("L")
			&& !alljobslist.equalsIgnoreCase("M") && !alljobslist.equalsIgnoreCase("N") && !alljobslist.equalsIgnoreCase("O")
			&& !alljobslist.equalsIgnoreCase("P") && !alljobslist.equalsIgnoreCase("Q") && !alljobslist.equalsIgnoreCase("R")
			&& !alljobslist.equalsIgnoreCase("S") && !alljobslist.equalsIgnoreCase("T"));
		
		if (alljobslist.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Computer Support Technician role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Desktop Support Technician role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Machine Learning Engineer role!");
			loopPrompt(in);
		} else if (alljobslist.equalsIgnoreCase("D")) {
			System.out.println("Congratulations you have officially applied for the Senior Software Engineer role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("E")) {
			System.out.println("Congratulations you have officially applied for the Electrical Engineer - Entry Level role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("F")) {
			System.out.println("Congratulations you have officially applied for the Network Engineer - 1 role!");
			loopPrompt(in);
		} else if (alljobslist.equalsIgnoreCase("G")) {
			System.out.println("Congratulations you have officially applied for the Nuclear Engineer - Mid Level role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("H")) {
			System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("I")) {
			System.out.println("Congratulations you have officially applied for the Deposit Support Specialist role!");
			loopPrompt(in);
		} else if (alljobslist.equalsIgnoreCase("J")) {
			System.out.println("Congratulations you have officially applied for the Finance Director role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("K")) {
			System.out.println("Congratulations you have officially applied for the Financial Analyst role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("L")) {
			System.out.println("Congratulations you have officially applied for the Financial Compliance Manager role!");
			loopPrompt(in);
		} else if (alljobslist.equalsIgnoreCase("M")) {
			System.out.println("Congratulations you have officially applied for the Clinic Medical Assistant role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("N")) {
			System.out.println("Congratulations you have officially applied for the Community Health Workern role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("O")) {
			System.out.println("Congratulations you have officially applied for the Physical Therapist role!");
			loopPrompt(in);
		} else if (alljobslist.equalsIgnoreCase("P")) {
			System.out.println("Congratulations you have officially applied for the Psychiatric Nurse Practitioner role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("Q")) {
			System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
			loopPrompt(in);
		} else  if (alljobslist.equalsIgnoreCase("R")) {
			System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
			loopPrompt(in);
		} else if (alljobslist.equalsIgnoreCase("S")) {
			System.out.println("Congratulations you have officially applied for the General Sales Manager role!");
			loopPrompt(in);
		} else {
			System.out.println("Congratulations you have officially applied for the Used Truck Sales Representative role!");
			loopPrompt(in);
		}
	}
		
}
