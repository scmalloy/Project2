package com.skillstorm.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSVWriter {
	private final String csvFile = "C:\\Users\\Users.csv";
	private final String resume = "C:\\User\\Resume.txt";
	
	public static void writeResume(Scanner in) {
		
		File file = new File("Resume.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			System.out.println("Welcome to the Resume Builder."
							 + "\nWe just need a little information from you.\n");
			String name;
			System.out.println("Please type your name: ");
			name = in.nextLine();
			bw.write(name + "'s Resume"
				   + "\n-----------------------------------------------------------------\n");
			String field;
			do {	
				System.out.println("What is your Job Field?"
							 + "\nA. Engineering"
							 + "\nB. Sales"
							 + "\nC. Finance"
							 + "\nD. Computer and Information Technology"
							 + "\nE. Healthcare");
				field = in.nextLine();
			} while (!field.equalsIgnoreCase("A") && !field.equalsIgnoreCase("B") && !field.equalsIgnoreCase("C")
					&& !field.equalsIgnoreCase("D") && !field.equalsIgnoreCase("E"));
			
			if (field.equalsIgnoreCase("A")) {
				bw.write("Career Field: Engineering");
			} else if (field.equalsIgnoreCase("B")) {
				bw.write("Career Field: Sales");
			} else if (field.equalsIgnoreCase("C")) {
				bw.write("Career Field: Finance");
			} else if (field.equalsIgnoreCase("D")) {
				bw.write("Career Field: Computer and Information Technology");
			} else {
				bw.write("Career Field: Healthcare");
			}
			
			bw.write("\n-----------------------------------------------------------------\n");
			
			String location;
			do {	
				System.out.println("Where are you located?"
								 + "\nA. West"
								 + "\nB. Midwest"
								 + "\nC. Southwest"
								 + "\nD. Southeast"
								 + "\nE. Northeast");
				location = in.nextLine();
			} while (!location.equalsIgnoreCase("A") && !location.equalsIgnoreCase("B") && !location.equalsIgnoreCase("C")
					&& !location.equalsIgnoreCase("D") && !location.equalsIgnoreCase("E"));
			
			if (location.equalsIgnoreCase("A")) {
				bw.write("Location: West");
			} else if (location.equalsIgnoreCase("B")) {
				bw.write("Location: Midwest");
			} else if (location.equalsIgnoreCase("C")) {
				bw.write("Location: Southwest");
			} else if (location.equalsIgnoreCase("D")) {
				bw.write("Location: Southeast");
			} else {
				bw.write("Location: Northeast");
			}
			
			bw.write("\n-----------------------------------------------------------------\n");
			
			String payrange;
			do {	
				System.out.println("What is your desired Job Field?"
								 + "\nA. $35,000 - $50,000"
								 + "\nB. $50,000 - $65,000"
								 + "\nC. $65,000 - $80,000"
								 + "\nD. $80,000 - $100,000"
								 + "\nE. $100,000+");
				payrange = in.nextLine();
			} while (!payrange.equalsIgnoreCase("A") && !payrange.equalsIgnoreCase("B") && !payrange.equalsIgnoreCase("C")
					&& !payrange.equalsIgnoreCase("D") && !payrange.equalsIgnoreCase("E"));
			
			if (payrange.equalsIgnoreCase("A")) {
				bw.write("Pay Range: $35,000 - $50,000");
			} else if (payrange.equalsIgnoreCase("B")) {
				bw.write("Pay Range: $50,000 - $65,000");
			} else if (payrange.equalsIgnoreCase("C")) {
				bw.write("Pay Range: $65,000 - $80,000");
			} else if (payrange.equalsIgnoreCase("D")) {
				bw.write("Pay Range:  $80,000 - $100,000");
			} else {
				bw.write("Pay Range: $100,000+");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Sorry This is unavailable. Please Try Again.");
			writeResume(in);
		}
	}
	
	public void writeResume(Scanner in) {
		
		File file = new File(resume);
		
		
		
	}
	
	public List<Account> csvFileReader() {
		
		List<Account> account = new LinkedList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			String line;
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] vals = line.split(" | ");
				Account record = new Account(vals[0].trim(), vals[1].trim(), vals[2].trim(), 
											vals[3].trim(), vals[4].trim());
				account.add(record);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return account;
	}
	
	public static void csvFileWriter(List<Account> account, String filePath) {
		File file = new File(filePath);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			bw.write("Name,UserID,Email,Phone,Password,");
			bw.newLine();
				for(Account a : account) {
					bw.write(a.getName() + "," + a.getUserID() + "," + a.getPassword()
						   + "," + a.getEmail() + "," + a.getPhone() + "\n");
					bw.newLine();
					bw.close();
				}
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}
	}
}	

