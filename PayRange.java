package com.skillstorm.beans;

import java.util.Scanner;

public class PayRange extends Jobs{

	public void payRange() {
		
		Scanner in = new Scanner(System.in); 
		String payRange;
		System.out.println("\n******************");
		
		do {
			System.out.println("Please choose your desired pay range: "
					+ "\nA.) $35,000 - $50,000"
					+ "\nB.) $50,000 - $65,000"
					+ "\nC.) $65,000 - $80,000"
					+ "\nD.) $80,000 - $100,000"
					+ "\nE.) $100,000+");
			payRange = in.nextLine();
			System.out.println("*****************************{ processing........ }*****************************\n");
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

	private void jobListA(Scanner in) {
		automotiveSalesConsultant();
		usedTruckSalesRepresentative();
		depositSupportSpecialist();
		communityHealthWorker();
		clinicMedicalAssistant();
	}
	
	private void jobListB(Scanner in) {
		electricalEngineerEL();
		computerSupportTechnician();
		desktopSupportTechnician();
	}
		
	private void jobListC(Scanner in) {
		networkEngineer();
		solarSalesRepresentative();
		financialAnalyst();
	}
	
	private void jobListD(Scanner in) {
		supervisoryMechanicalEngineer();
		financeDirector();
		physicalTherapist();
		
	}

	private void jobListE(Scanner in) {
		nuclearEngineerML();
		financialComplianceManager();
		generalSalesManager();
		seniorSoftwareEngineer();
		machineLearningEngineer();
		psychiatricNursePractitioner();
}


}
