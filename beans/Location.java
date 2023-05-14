package com.skillstorm.beans;

import java.util.Scanner;

public class Location extends Jobs{

	public void location() {
		
		Scanner in = new Scanner(System.in); 
		String location;
		System.out.println("\n******************");
		
		
		do {
			System.out.println("Please choose your desired location: "
					+ "\nA.) West"
					+ "\nB.) Midwest"
					+ "\nC.) Southwest"
					+ "\nD.) Southeast"
					+ "\nE.) Northeast");
			location = in.nextLine();
			
			System.out.println("*****************************{ processing........ }*****************************\n");
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

	public void west(Scanner in) {
		supervisoryMechanicalEngineer();
		automotiveSalesConsultant();
		computerSupportTechnician();
		clinicMedicalAssistant();
		
	}
	
	public void midwest(Scanner in) {
		electricalEngineerEL();
		usedTruckSalesRepresentative();
		financialAnalyst();
		seniorSoftwareEngineer();
		
	}

	public void southwest(Scanner in) {
		depositSupportSpecialist();
		communityHealthWorker();
		physicalTherapist();
	
	}

	public void southeast(Scanner in) {
		supervisoryMechanicalEngineer();
		solarSalesRepresentative();
		financeDirector();
		psychiatricNursePractitioner();
		
	}

	public void northeast(Scanner in) {
		nuclearEngineerML();
		automotiveSalesConsultant();
		financialComplianceManager();
		machineLearningEngineer();
		desktopSupportTechnician();
		
	}
}
