package com.skillstorm.beans;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skillstorm.CSVWriter;
import com.skillstorm.JobsRUs;

public class Jobs extends CSVWriter {

	public void allJobs(Scanner in) {
		 try {
	           List<String[]> csvData = readCSV("C:\\Users\\sarah\\Downloads\\jobListings\\jobListingAlljobs.csv");
	           formatAsTable(csvData);
	       } catch (IOException e) {
	           System.err.println("An error occurred: " + e.getMessage());
	       }
		 if (JobsRUs.isSignIn() == true) {
			 String alljobslist;
			 do {
				 System.out.println("Please choose the job you would like to apply to: "
						 		  + "\n-------------------------- Computer and Information Technology ---------------------------\n"
						 		  + "\nA. Computer Support Technician"
						 		  + "\nB. Desktop Support Technician"
						 		  + "\nC. Machine Learning Engineer"
						 		  + "\nD. Senior Software Engineer" 
						 		  + "\n-------------------------------------- Engineering ---------------------------------------\n"
						 		  + "\nE. Electrical Engineer - Entry Level"
						 		  + "\nF. Network Engineer - 1"
						 		  + "\nG. Nuclear Engineer - Mid Level"
						 		  + "\nH. Supervisory Mechanical Engineer" 
						 		  + "\n----------------------------------------- Finance ------------------------------------------\n"
						 		  + "\nI. Deposit Support Specialist"
						 		  + "\nJ. Finance Director"
						 		  + "\nK. Financial Analyst" 
						 		  + "\nL. Financial Compliance Manager"
						 		  + "\n---------------------------------------- Healthcare -----------------------------------------\n"
						 		  + "\nM. Clinic Medical Assistant"
						 		  + "\nN. Community Health Worker" 
						 		  + "\nO. Physical Therapist"
						 		  + "\nP. Psychiatric Nurse Practitioner"
						 		  + "\n--------------------------------------- Sales ---------------------------------------\n"
						 		  + "\nQ. Automotive Sales Consultant"
						 		  + "\nR. Entry Level Solar Sales Representative" 
						 		  + "\nS. General Sales Manager" 
						 		  + "\nT. Used Truck Sales Representative"
						 		  + "\nU. Return to Job Selection homescreen");
				 alljobslist = in.nextLine();
				
				 System.out.println("---------------------------------{ processing........ }---------------------------------\n");
			 } while (!alljobslist.equalsIgnoreCase("A") && !alljobslist.equalsIgnoreCase("B") && !alljobslist.equalsIgnoreCase("C") 
				   && !alljobslist.equalsIgnoreCase("D") && !alljobslist.equalsIgnoreCase("E") && !alljobslist.equalsIgnoreCase("F")
				   && !alljobslist.equalsIgnoreCase("G") && !alljobslist.equalsIgnoreCase("H") && !alljobslist.equalsIgnoreCase("I")
				   && !alljobslist.equalsIgnoreCase("J") && !alljobslist.equalsIgnoreCase("K") && !alljobslist.equalsIgnoreCase("L")
				   && !alljobslist.equalsIgnoreCase("M") && !alljobslist.equalsIgnoreCase("N") && !alljobslist.equalsIgnoreCase("O")
				   && !alljobslist.equalsIgnoreCase("P") && !alljobslist.equalsIgnoreCase("Q") && !alljobslist.equalsIgnoreCase("R")
				   && !alljobslist.equalsIgnoreCase("S") && !alljobslist.equalsIgnoreCase("T") && !alljobslist.equalsIgnoreCase("U"));
		
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
			 } else if (alljobslist.equalsIgnoreCase("K")) {
				 System.out.println("Congratulations you have officially applied for the Financial Analyst role!");
				 loopPrompt(in);
			 } else if (alljobslist.equalsIgnoreCase("L")) {
				 System.out.println("Congratulations you have officially applied for the Financial Compliance Manager role!");
				 loopPrompt(in);
			 } else if (alljobslist.equalsIgnoreCase("M")) {
				 System.out.println("Congratulations you have officially applied for the Clinic Medical Assistant role!");
				 loopPrompt(in);
			 } else if (alljobslist.equalsIgnoreCase("N")) {
				 System.out.println("Congratulations you have officially applied for the Community Health Workern role!");
				 loopPrompt(in);
			 } else if (alljobslist.equalsIgnoreCase("O")) {
				 System.out.println("Congratulations you have officially applied for the Physical Therapist role!");
				 loopPrompt(in);
			 } else if (alljobslist.equalsIgnoreCase("P")) {
				 System.out.println("Congratulations you have officially applied for the Psychiatric Nurse Practitioner role!");
				 loopPrompt(in);
			 } else if (alljobslist.equalsIgnoreCase("Q")) {
				 System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
				 loopPrompt(in);
			 } else if (alljobslist.equalsIgnoreCase("R")) {
				 System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
				 loopPrompt(in);
			 } else if (alljobslist.equalsIgnoreCase("S")) {
				 System.out.println("Congratulations you have officially applied for the General Sales Manager role!");
				 loopPrompt(in);
			 } else if (alljobslist.equalsIgnoreCase("T")) {
				 System.out.println("Congratulations you have officially applied for the Used Truck Sales Representative role!");
				 loopPrompt(in);
			 } else {
				 JobsRUs.jobSelection(in);
			 }
		 } else {
				JobsRUs.jobSelection(in);
		 }
	}	
}
