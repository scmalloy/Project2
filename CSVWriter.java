package com.skillstorm.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVWriter extends JobsRUs {

	public static void writeResume(Scanner in) {
		File   file          = new File("C:\\User\\" + account.getName() + ".txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			System.out.println("Welcome to the Resume Builder."
							 + "\nWe just need a little information from you.\n");
			String name;
			System.out.println("Please type your full name: ");
			name = in.nextLine();
			bw.write(name + "'s Resume"
				   + "\n-----------------------------------------------------------------\n");
			String field;
			do {	
				System.out.println("\nWhat is your Job Field?"
							 + "\nA. Engineering"
							 + "\nB. Sales"
							 + "\nC. Finance"
							 + "\nD. Computer and Information Technology"
							 + "\nE. Healthcare\n");
				field = in.nextLine();
			} while (!field.equalsIgnoreCase("A") && !field.equalsIgnoreCase("B") && !field.equalsIgnoreCase("C")
					&& !field.equalsIgnoreCase("D") && !field.equalsIgnoreCase("E"));
			
			if (field.equalsIgnoreCase("A")) {
				field = "Engineering";
				bw.write("Career Field: Engineering");
			} else if (field.equalsIgnoreCase("B")) {
				field = "Sales";
				bw.write("Career Field: Sales");
			} else if (field.equalsIgnoreCase("C")) {
				field = "Finance";
				bw.write("Career Field: Finance");
			} else if (field.equalsIgnoreCase("D")) {
				field = "Computer and Information Technology";
				bw.write("Career Field: Computer and Information Technology");
			} else {
				field = "Healthcare";
				bw.write("Career Field: Healthcare");
			}
			
			bw.write("\n-----------------------------------------------------------------\n");
			
			String location;
			do {	
				System.out.println("\nWhere are you located?"
								 + "\nA. West"
								 + "\nB. Midwest"
								 + "\nC. Southwest"
								 + "\nD. Southeast"
								 + "\nE. Northeast\n");
				location = in.nextLine();
			} while (!location.equalsIgnoreCase("A") && !location.equalsIgnoreCase("B") && !location.equalsIgnoreCase("C")
					&& !location.equalsIgnoreCase("D") && !location.equalsIgnoreCase("E"));
			
			if (location.equalsIgnoreCase("A")) {
				location = "West";
				bw.write("Location: West");
			} else if (location.equalsIgnoreCase("B")) {
				location = "Midwest";
				bw.write("Location: Midwest");
			} else if (location.equalsIgnoreCase("C")) {
				location = "Southwest";
				bw.write("Location: Southwest");
			} else if (location.equalsIgnoreCase("D")) {
				location = "Southeast";
				bw.write("Location: Southeast");
			} else {
				location = "Northeast";
				bw.write("Location: Northeast");
			}
			
			bw.write("\n-----------------------------------------------------------------\n");
			
			String payrange;
			do {	
				System.out.println("\nWhat is your desired Job Field?"
								 + "\nA. $35,000 - $50,000"
								 + "\nB. $50,000 - $65,000"
								 + "\nC. $65,000 - $80,000"
								 + "\nD. $80,000 - $100,000"
								 + "\nE. $100,000+\n");
				payrange = in.nextLine();
			} while (!payrange.equalsIgnoreCase("A") && !payrange.equalsIgnoreCase("B") && !payrange.equalsIgnoreCase("C")
					&& !payrange.equalsIgnoreCase("D") && !payrange.equalsIgnoreCase("E"));
			
			if (payrange.equalsIgnoreCase("A")) {
				payrange = "$35,000 - $50,000";
				bw.write("Pay Range: $35,000 - $50,000");
			} else if (payrange.equalsIgnoreCase("B")) {
				payrange = "$50,000 - $65,000";
				bw.write("Pay Range: $50,000 - $65,000");
			} else if (payrange.equalsIgnoreCase("C")) {
				payrange = "$65,000 - $80,000";
				bw.write("Pay Range: $65,000 - $80,000");
			} else if (payrange.equalsIgnoreCase("D")) {
				payrange = "$80,000 - $100,000";
				bw.write("Pay Range:  $80,000 - $100,000");
			} else {
				payrange = "$100,000+";
				bw.write("Pay Range: $100,000+");
			}
			
			System.out.println("\nName: " + name
					+ "\nJob Field: " + field
					+ "\nLocation: " + location
					+ "\nPay Range: " + payrange);
			String check;
			do {
				System.out.println("\nIs that correct? "
						  		 + "\nPlease enter Y/N: \n");
				check = in.nextLine();
			} while (!check.equalsIgnoreCase("Y") && !check.equalsIgnoreCase("N"));
			
			if (check.equalsIgnoreCase("Y")) {
				System.out.println("Thank you! Your resume has been created.");
			} else {
				System.out.println("Please Remake Resume.");
				writeResume(in);
			}
			
			bw.close();
		} catch (IOException e) {
			System.out.println("Something went wrong. Please Try Again.");
			writeResume(in);
		}
		
	}
	
	public static void csvFileWriter(List<Account> account, String filePath) {
		File file = new File(filePath);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
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
	
	 public static List<String[]> readCSV(String filePath) throws IOException {
	        List<String[]> csvData = new ArrayList<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] row = line.split(",");
	                csvData.add(row);
	            }
	        }
	        return csvData;
	    }

	    public static void formatAsTable(List<String[]> data) {
	        int[] columnWidths = calculateColumnWidths(data);

	        for (String[] row : data) {
	            StringBuilder formattedRow = new StringBuilder();
	            for (int i = 0; i < row.length; i++) {
	                String cell = row[i];
	                String formattedCell = String.format("%-" + columnWidths[i] + "s", cell);
	                formattedRow.append(formattedCell).append(" | ");
	            }
	            System.out.println(formattedRow.toString());
	        }
	    }

	    public static int[] calculateColumnWidths(List<String[]> data) {
	        int columnCount = data.get(0).length;
	        int[] columnWidths = new int[columnCount];
	        
	        for (String[] row : data) {
	            for (int i = 0; i < columnCount; i++) {
	                int cellLength = row[i].length();
	                if (cellLength > columnWidths[i]) {
	                    columnWidths[i] = cellLength;
	                }
	            }
	        }
	        
	        return columnWidths;
	    }
	
	public void loopPrompt(Scanner in) {
			
			String yesorno;
			do {
				System.out.println("\nWould you like to apply to another job?"
					+ "\nChoose Y to return to the Job Selection homescreen or N to end your session.");
				yesorno = in.nextLine();
			} while (!yesorno.equalsIgnoreCase("Y") && !yesorno.equalsIgnoreCase("N"));
		
			if(yesorno.equalsIgnoreCase("Y")) {
				JobsRUs.jobSelection(in);
			} else {
				System.out.println("This concludes your job application!");
			}
		}
		
}	
