package com.skillstorm.beans;

import java.util.Scanner;

public class Location extends Jobs{

	public void location() {
		
		Scanner in = new Scanner(System.in); 
		String location;
		System.out.println("\n-------------------------------------------------------------------------------------------\n");
		
		
		do {
			System.out.println("Please choose your desired location: "
					+ "\nA. West"
					+ "\nB. Midwest"
					+ "\nC. Southwest"
					+ "\nD. Southeast"
					+ "\nE. Northeast");
			location = in.nextLine();
			
			System.out.println("---------------------------------{ processing........ }---------------------------------\n");
		} while (!location.equalsIgnoreCase("A") && !location.equalsIgnoreCase("B") 
				&& !location.equalsIgnoreCase("C") && !location.equalsIgnoreCase("D") && !location.equalsIgnoreCase("E"));
		
		if (location.equalsIgnoreCase("A")) {
			west(in);	
		} else  if (location.equalsIgnoreCase("B")) {
			midwest(in);	
		} else  if (location.equalsIgnoreCase("C")) {
			southwest(in);	
		} else  if (location.equalsIgnoreCase("D")) {
			southeast(in);	
		} else {
			northeast(in);	
		}

	}

	public void west(Scanner in) { System.out.println("\n------------------------------------- West -------------------------------------\n");
		String west;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); supervisoryMechanicalEngineer();
				System.out.println("B. "); automotiveSalesConsultant();
				System.out.println("C. "); computerSupportTechnician();
				System.out.println("D. "); clinicMedicalAssistant();
			west = in.nextLine();
			
		} while (!west.equalsIgnoreCase("A") && !west.equalsIgnoreCase("B") 
				&& !west.equalsIgnoreCase("C") && !west.equalsIgnoreCase("D"));
		
		if (west.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Supervisory Mechanical Engineer role!");
		} else  if (west.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
		} else  if (west.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Computer Support Technician role!");
		} else {
			System.out.println("Congratulations you have officially applied for the Clinic Medical Assistant role!");
		}
		
	}
	
	public void midwest(Scanner in) {System.out.println("\n------------------------------------- Midwest -------------------------------------\n");
		String midwest;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); electricalEngineerEL();
				System.out.println("B. "); usedTruckSalesRepresentative();
				System.out.println("C. "); financialAnalyst();
				System.out.println("D. "); seniorSoftwareEngineer();
			midwest = in.nextLine();
			
		} while (!midwest.equalsIgnoreCase("A") && !midwest.equalsIgnoreCase("B") 
				&& !midwest.equalsIgnoreCase("C") && !midwest.equalsIgnoreCase("D"));
		
		if (midwest.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Electrical Engineer - Entry Level role!");
		} else  if (midwest.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Used Truck Sales Representative role!");
		} else  if (midwest.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Financial Analyst role!");
		} else {
			System.out.println("Congratulations you have officially applied for the Senior Software Engineer role!");
		}
	}

	
	public void southwest(Scanner in) {System.out.println("\n------------------------------------- Southwest -------------------------------------\n");
		String southwest;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); depositSupportSpecialist();
				System.out.println("B. "); communityHealthWorker();
				System.out.println("C. "); physicalTherapist();
			southwest = in.nextLine();
			
		} while (!southwest.equalsIgnoreCase("A") && !southwest.equalsIgnoreCase("B") 
				&& !southwest.equalsIgnoreCase("C"));
		
		if (southwest.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Deposit Support Specialist role!");
		} else  if (southwest.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Community Health Worker role!");
		} else  {
			System.out.println("Congratulations you have officially applied for the Physical Therapist role!");
		} 
	}

	
	public void southeast(Scanner in) {System.out.println("\n------------------------------------- Southeast -------------------------------------\n");
		String southeast;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); networkEngineer();
				System.out.println("B. "); solarSalesRepresentative();
				System.out.println("C. "); financeDirector();
				System.out.println("D. "); psychiatricNursePractitioner();
			southeast = in.nextLine();
			
		} while (!southeast.equalsIgnoreCase("A") && !southeast.equalsIgnoreCase("B") 
				&& !southeast.equalsIgnoreCase("C") && !southeast.equalsIgnoreCase("D"));
		
		if (southeast.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Network Engineer - 1 role!");
		} else  if (southeast.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
		} else  if (southeast.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Finance Director role!");
		} else {
			System.out.println("Congratulations you have officially applied for the Psychiatric Nurse Practitioner role!");
		}
	}

	
	public void northeast(Scanner in) {System.out.println("\n------------------------------------- Northeast -------------------------------------\n");
		String northeast;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); nuclearEngineerML();
				System.out.println("B. "); automotiveSalesConsultant();
				System.out.println("C. "); financialComplianceManager();
				System.out.println("D. "); machineLearningEngineer();
				System.out.println("E. "); desktopSupportTechnician();
			northeast = in.nextLine();
			
		} while (!northeast.equalsIgnoreCase("A") && !northeast.equalsIgnoreCase("B") 
				&& !northeast.equalsIgnoreCase("C") && !northeast.equalsIgnoreCase("D") && !northeast.equalsIgnoreCase("E"));
		
		if (northeast.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Nuclear Engineer - Mid Level role!");
		} else  if (northeast.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
		} else  if (northeast.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Financial Compliance Manager role!");
		} else  if (northeast.equalsIgnoreCase("D")) {
			System.out.println("Congratulations you have officially applied for the Machine Learning Engineer role!");
		}else {
			System.out.println("Congratulations you have officially applied for the Desktop Support Technician role!");
		}
	}
}
