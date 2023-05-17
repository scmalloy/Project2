package com.skillstorm.beans;

import java.util.Scanner;

public class Field extends Jobs {
	
	public void field() {
		
		Scanner in = new Scanner(System.in);
		String jobType;
		System.out.println("\n-------------------------------------------------------------------------------------------\n");
		
		do {
			System.out.println("Please choose the job field you are interested in: "
					+ "\nA. Engineering"
					+ "\nB. Sales"
					+ "\nC. Finance"
					+ "\nD. Computer and Information Technology"
					+ "\nE. Healthcare");
			jobType = in.nextLine();
			
			System.out.println("---------------------------------{ processing........ }---------------------------------\n");
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
		String eng;
		do {
			System.out.println("\n------------------------------------- Engineering -------------------------------------\n"
				+ "\nPlease choose A, B, C, or D for the Engineering job you would like to apply to: "
				+ "\n\nA. "); supervisoryMechanicalEngineer();
				System.out.println("B. "); networkEngineer();
				System.out.println("C. "); electricalEngineerEL();
				System.out.println("D. "); nuclearEngineerML();
			eng = in.nextLine();
			
		} while (!eng.equalsIgnoreCase("A") && !eng.equalsIgnoreCase("B") 
				&& !eng.equalsIgnoreCase("C") && !eng.equalsIgnoreCase("D"));
		
		if (eng.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Supervisory Mechanical Engineer role!");
		} else  if (eng.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Network Engineer - 1 role!");
		} else  if (eng.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Electrical Engineer - Entry Level role!");
		} else {
			System.out.println("Congratulations you have officially applied for the Nuclear Engineer - Mid Levelrole!");
		}
	}
	
	
	public void sales(Scanner in) {
		String sales;
		do {
			System.out.println("\n------------------------------------- Sales -------------------------------------\n"
				+ "\nPlease choose A, B, C, or D the Sales job you would like to apply to: "
				+ "\n\nA. "); automotiveSalesConsultant();
				System.out.println("B. "); generalSalesManager();
				System.out.println("C. "); usedTruckSalesRepresentative();
				System.out.println("D. "); solarSalesRepresentative();
			sales = in.nextLine();
			
		} while (!sales.equalsIgnoreCase("A") && !sales.equalsIgnoreCase("B") 
				&& !sales.equalsIgnoreCase("C") && !sales.equalsIgnoreCase("D"));
		
		if (sales.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Automotive Sales Consultant role!");
		} else  if (sales.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the General Sales Manager role!");
		} else  if (sales.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Used Truck Sales Representative role!");
		} else {
			System.out.println("Congratulations you have officially applied for the Entry Level Solar Sales Representative role!");
		}
	}
	
	
	public void finance(Scanner in) {
		String fin;
		do {
			System.out.println("\n------------------------------------- Finance -------------------------------------\n"
				+ "\nPlease choose A, B, C, or D the Finance job you would like to apply to: "
				+ "\n\nA. "); financeDirector();
				System.out.println("B. "); financialAnalyst();
				System.out.println("C. "); financialComplianceManager();
				System.out.println("D. "); depositSupportSpecialist();
			fin = in.nextLine();
			
		} while (!fin.equalsIgnoreCase("A") && !fin.equalsIgnoreCase("B") 
				&& !fin.equalsIgnoreCase("C") && !fin.equalsIgnoreCase("D"));
		
		if (fin.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Finance Director role!");
		} else  if (fin.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Financial Analyst role!");
		} else  if (fin.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Financial Compliance Manager role!");
		} else {
			System.out.println("Congratulations you have officially applied for the Deposit Support Specialist role!");
		}
	}
	
	
	public void computerIT(Scanner in) {
		String compIT;
		do {
			System.out.println("\n------------------------------------- Computer and Information Technology -------------------------------------\n"
				+ "\nPlease choose A, B, C, or D the Computer and Information Technology job you would like to apply to: "
				+ "\n\nA. "); seniorSoftwareEngineer();
				System.out.println("B. "); computerSupportTechnician();
				System.out.println("C. "); machineLearningEngineer();
				System.out.println("D. "); desktopSupportTechnician();
			compIT = in.nextLine();
			
		} while (!compIT.equalsIgnoreCase("A") && !compIT.equalsIgnoreCase("B") 
				&& !compIT.equalsIgnoreCase("C") && !compIT.equalsIgnoreCase("D"));
		
		if (compIT.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Senior Software Engineer role!");
		} else  if (compIT.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Computer Support Technician role!");
		} else  if (compIT.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Machine Learning Engineer role!");
		} else {
			System.out.println("Congratulations you have officially applied for the Desktop Support Technician role!");
		}
	}
	
	
	public void healthcare(Scanner in) {
		String health;
		do {
			System.out.println("\n------------------------------------- Healthcare -------------------------------------\n"
				+ "\nPlease choose A, B, C, or D the Healthcare job you would like to apply to: "
				+ "\n\nA. "); communityHealthWorker();
				System.out.println("B. "); clinicMedicalAssistant();
				System.out.println("C. "); physicalTherapist();
				System.out.println("D. "); psychiatricNursePractitioner();
			health = in.nextLine();
			
		} while (!health.equalsIgnoreCase("A") && !health.equalsIgnoreCase("B") 
				&& !health.equalsIgnoreCase("C") && !health.equalsIgnoreCase("D"));
		
		if (health.equalsIgnoreCase("A")) {
			System.out.println("Congratulations you have officially applied for the Community Health Worker role!");
		} else  if (health.equalsIgnoreCase("B")) {
			System.out.println("Congratulations you have officially applied for the Clinic Medical Assistant role!");
		} else  if (health.equalsIgnoreCase("C")) {
			System.out.println("Congratulations you have officially applied for the Physical Therapist role!");
		} else {
			System.out.println("Congratulations you have officially applied for the Psychiatric Nurse Practitioner role!");
		}
	}
}
