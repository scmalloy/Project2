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
	
	public void resume(Scanner in) {
		
		String resumeChoice;
		do {
		System.out.println("Do you need a resume? "
						 + "/nA. Yes"
						 + "/nB. No");
		resumeChoice = in.nextLine();
		} while (!resumeChoice.equalsIgnoreCase("A") && !resumeChoice.equalsIgnoreCase("B"));
		
		if (resumeChoice.equalsIgnoreCase("A")) {
			writeResume(in);
		} else {
			
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
				for(Account a : account) {
					bw.write(a.getName() + "," + a.getUserID() + "," + a.getPassword()
						   + "," + a.getEmail() + "," + a.getPhone());
					bw.newLine();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
	}
}	

