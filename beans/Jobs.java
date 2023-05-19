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

	}
		
}
