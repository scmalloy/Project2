package com.skillstorm.beans;

import java.util.Scanner;

public class Field extends Jobs {
	
	public void field() {
		
		Scanner in = new Scanner(System.in);
		String jobType;
		System.out.println("\n******************");
		
		do {
			System.out.println("Please choose the job field you are interested in: "
					+ "\nA.) Engineering"
					+ "\nB.) Sales"
					+ "\nC.) Finance"
					+ "\nD.) Computer and Information Technology"
					+ "\nE.) Healthcare");
			jobType = in.nextLine();
			
			System.out.println("*****************************{ processing........ }*****************************\n");
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
		// Engineering jobs: civil engineer, mechanical engineer, biomedical engineer, chemical engineer
		String eng;
		do {
			System.out.println("Please choose the Engineering job you would like to apply to: "
				+ "\nA.) Supervisory Mechanical Engineer"
				+ "\nB.) Network Engineer - 1"
				+ "\nC.) Electrical Engineer - Entry Level"
				+ "\nD.) Nuclear Engineer - Mid Level");
			eng = in.nextLine();
			
		} while (!eng.equalsIgnoreCase("A") && !eng.equalsIgnoreCase("B") 
				&& !eng.equalsIgnoreCase("C") && !eng.equalsIgnoreCase("D"));
		
		if (eng.equalsIgnoreCase("A")) {
			supervisoryMechanicalEngineer();	
		} else  if (eng.equalsIgnoreCase("B")) {
			networkEngineer();
		} else  if (eng.equalsIgnoreCase("C")) {
			electricalEngineerEL();
		} else {
			nuclearEngineerML();
		}
	}
	
	public void sales(Scanner in) {
		String sales;
		do {
			System.out.println("Please choose the Sales job you would like to apply to: "
				+ "\nA.) Automotive Sales Consultant"
				+ "\nB.) General Sales Manager"
				+ "\nC.) Used Truck Sales Representative"
				+ "\nD.) Entry Level Solar Sales Representative");
			sales = in.nextLine();
			
		} while (!sales.equalsIgnoreCase("A") && !sales.equalsIgnoreCase("B") 
				&& !sales.equalsIgnoreCase("C") && !sales.equalsIgnoreCase("D"));
		
		if (sales.equalsIgnoreCase("A")) {
			System.out.println("");	
		} else  if (sales.equalsIgnoreCase("B")) {
			System.out.println("");
		} else  if (sales.equalsIgnoreCase("C")) {
			System.out.println("");
		} else {
			System.out.println("");
		}
	}
	
	public void finance(Scanner in) {
		String fin;
		do {
			System.out.println("Please choose the Finance job you would like to apply to: "
				+ "\nA.) Finance Director"
				+ "\nB.) Financial Analyst"
				+ "\nC.) Financial Compliance Manager"
				+ "\nD.) Deposit Support Specialist");
			fin = in.nextLine();
			
		} while (!fin.equalsIgnoreCase("A") && !fin.equalsIgnoreCase("B") 
				&& !fin.equalsIgnoreCase("C") && !fin.equalsIgnoreCase("D"));
		
		if (fin.equalsIgnoreCase("A")) {
			System.out.println("");	
		} else  if (fin.equalsIgnoreCase("B")) {
			System.out.println("");
		} else  if (fin.equalsIgnoreCase("C")) {
			System.out.println("");
		} else {
			System.out.println("");
		}
		
	}
	
	public void computerIT(Scanner in) {
		String compIT;
		do {
			System.out.println("Please choose the Computer and Information Technology job you would like to apply to: "
				+ "\nA.) Senior Software Engineer"
				+ "\nB.) Computer Support Technician"
				+ "\nC.) Machine Learning Engineer"
				+ "\nD.) Desktop Support Technician");
			compIT = in.nextLine();
			
		} while (!compIT.equalsIgnoreCase("A") && !compIT.equalsIgnoreCase("B") 
				&& !compIT.equalsIgnoreCase("C") && !compIT.equalsIgnoreCase("D"));
		
		if (compIT.equalsIgnoreCase("A")) {
			System.out.println("");	
		} else  if (compIT.equalsIgnoreCase("B")) {
			System.out.println("");
		} else  if (compIT.equalsIgnoreCase("C")) {
			System.out.println("");
		} else {
			System.out.println("");
		}
	}
	
	public void healthcare(Scanner in) {
		String health;
		do {
			System.out.println("Please choose the Healthcare job you would like to apply to: "
				+ "\nA.) Community Health Worker"
				+ "\nB.) Clinic Medical Assistant"
				+ "\nC.) Physical Therapist"
				+ "\nD.) Psychiatric Nurse Practitioner");
			health = in.nextLine();
			
		} while (!health.equalsIgnoreCase("A") && !health.equalsIgnoreCase("B") 
				&& !health.equalsIgnoreCase("C") && !health.equalsIgnoreCase("D"));
		
		if (health.equalsIgnoreCase("A")) {
			System.out.println("");	
		} else  if (health.equalsIgnoreCase("B")) {
			System.out.println("");
		} else  if (health.equalsIgnoreCase("C")) {
			System.out.println("");
		} else {
			System.out.println("");
		}
	}
}
