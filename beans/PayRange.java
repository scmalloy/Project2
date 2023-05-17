package com.skillstorm.beans;

import java.util.Scanner;

public class PayRange extends Jobs{

	public void payRange() {
		
		Scanner in = new Scanner(System.in); 
		String payRange;
		System.out.println("\n-------------------------------------------------------------------------------------------\n");
		
		do {
			System.out.println("Please choose your desired pay range: "
					+ "\nA. $35,000 - $50,000"
					+ "\nB. $50,000 - $65,000"
					+ "\nC. $65,000 - $80,000"
					+ "\nD. $80,000 - $100,000"
					+ "\nE. $100,000+");
			payRange = in.nextLine();
			System.out.println("---------------------------------{ processing........ }---------------------------------\n");
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

	private void jobListA(Scanner in) { System.out.println("\n------------------------------------- $35,000 - $ 50,000 -------------------------------------\n");
		String listA;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); automotiveSalesConsultant();
				System.out.println("B. "); usedTruckSalesRepresentative();
				System.out.println("C. "); depositSupportSpecialist();
				System.out.println("D. "); communityHealthWorker();
				System.out.println("E. "); clinicMedicalAssistant();
			listA = in.nextLine();
			
		} while (!listA.equalsIgnoreCase("A") && !listA.equalsIgnoreCase("B") 
				&& !listA.equalsIgnoreCase("C") && !listA.equalsIgnoreCase("D") && !listA.equalsIgnoreCase("E"));
		
		if (listA.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
		} else  if (listA.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Used Truck Sales Representative role!");
		} else  if (listA.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Deposit Support Specialist role!");
		} else  if (listA.equalsIgnoreCase("D")) {
			System.out.println("Congratulations you have officially applied for the Community Health Worker role!");
		}else {
			System.out.println("Congratulations you have officially applied for the Clinic Medical Assistant role!");
		}
	}
	
	
	private void jobListB(Scanner in) { System.out.println("\n------------------------------------- $50,000 - $65,000 -------------------------------------\n");
		String listB;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); electricalEngineerEL();
				System.out.println("B. "); computerSupportTechnician();
				System.out.println("C. "); desktopSupportTechnician();
			listB = in.nextLine();
			
		} while (!listB.equalsIgnoreCase("A") && !listB.equalsIgnoreCase("B") 
				&& !listB.equalsIgnoreCase("C"));
		
		if (listB.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Electrical Engineer - Entry Level role!");
		} else  if (listB.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Computer Support Technician role!");
		} else  {
			System.out.println("Congratulations you have officially applied for the Desktop Support Technician role!");
		} 
	}
		
	
	private void jobListC(Scanner in) { System.out.println("\n------------------------------------- $65,000 - $80,000 -------------------------------------\n");
		String listC;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); networkEngineer();
				System.out.println("B. "); solarSalesRepresentative();
				System.out.println("C. "); financialAnalyst();
			listC = in.nextLine();
			
		} while (!listC.equalsIgnoreCase("A") && !listC.equalsIgnoreCase("B") 
				&& !listC.equalsIgnoreCase("C"));
		
		if (listC.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Network Engineer - 1 role!");
		} else  if (listC.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
		} else  {
			System.out.println("Congratulations you have officially applied for the Financial Analyst role!");
		} 
	}
	
	
	private void jobListD(Scanner in) { System.out.println("\n------------------------------------- $80,000 - $100,000 -------------------------------------\n");
		String listD;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); supervisoryMechanicalEngineer();
				System.out.println("B. "); financeDirector();
				System.out.println("C. "); physicalTherapist();
			listD = in.nextLine();
			
		} while (!listD.equalsIgnoreCase("A") && !listD.equalsIgnoreCase("B") 
				&& !listD.equalsIgnoreCase("C"));
		
		if (listD.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Supervisory Mechanical Engineer role!");
		} else  if (listD.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Finance Director role!");
		} else  {
			System.out.println("Congratulations you have officially applied for the Physical Therapist role!");
		}
	}

	
	private void jobListE(Scanner in) { System.out.println("\n------------------------------------- $100,000+ -------------------------------------\n");
		String listE;
		do {
			System.out.println("\nPlease choose A, B, C, or D for the job you would like to apply to: "
				+ "\n\nA. "); nuclearEngineerML();
				System.out.println("B. "); financialComplianceManager();
				System.out.println("C. "); generalSalesManager();
				System.out.println("D. "); seniorSoftwareEngineer();
				System.out.println("E. "); machineLearningEngineer();
				System.out.println("F. "); psychiatricNursePractitioner();
			listE = in.nextLine();
			
		} while (!listE.equalsIgnoreCase("A") && !listE.equalsIgnoreCase("B") 
				&& !listE.equalsIgnoreCase("C") && !listE.equalsIgnoreCase("D") 
				&& !listE.equalsIgnoreCase("E") && !listE.equalsIgnoreCase("F"));
		
		if (listE.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Nuclear Engineer - Mid Level role!");
		} else  if (listE.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Financial Compliance Manager role!");
		} else  if (listE.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the General Sales Manager role!");
		} else  if (listE.equalsIgnoreCase("D")) {
			System.out.println("Congratulations you have officially applied for the Senior Software Engineer role!");
		} else  if (listE.equalsIgnoreCase("F")) {
			System.out.println("Congratulations you have officially applied for the Machine Learning Engineer role!");
		}else {
			System.out.println("Congratulations you have officially applied for the Psychiatric Nurse Practitioner role!");
		}
	}
}
