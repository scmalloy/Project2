package com.skillstorm.project;

import java.util.ArrayList;
import java.util.Scanner;

import com.skillstorm.beans.Field;
import com.skillstorm.beans.Jobs;
import com.skillstorm.beans.Location;
import com.skillstorm.beans.PayRange;

public class JobsRUs extends Jobs {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Jobs R Us where we can find you a jobs with no problems!");
		 System.out.println("Job Application Management Program" + "\n----------------------------------" );
		
		 String choice; 
		 
		do { System.out.println( "\nA. Create Account" 
	        						+ "\nB. Sign In" 
	        						+ "\nC. View Jobs" 
	        						+ "\nD. Quit");
		
		choice = in.nextLine();
		
	//////// might change to a switch case ///////// 
		 } while (!(choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B") || choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("D") ));
		
		if (choice.equalsIgnoreCase("A")) {
			createAccount();
				
		  } else if (choice.equalsIgnoreCase("B")) {
			 signIn();
			  
			} else if (choice.equalsIgnoreCase("C")) {
				jobSelection();
				
			} else if (choice.equalsIgnoreCase("D")) {
				System.out.println("Have a great day! \nGoodbye");
				
			}	
	}
	
	
	public static void createAccount() {
		
		Account account = new Account();
		ArrayList<Account> a = new ArrayList<>();
		
		System.out.println("Welcome lets create your account");
		System.out.println("\nPlease pick a user ID");
		String id = in.nextLine();
		account.setUserID(id);
		
		System.out.println("\nPlease pick a password");
		String password = in.nextLine();
		account.setPassword(password);

		System.out.println("\nPlease enter your name.");
		String name = in.nextLine(); 
		account.setName(name);
		//System.out.println("\nWELCOME!: " + name );
		
		System.out.println("\nPlease enter a valid email adress");
		String email = in.nextLine();
		account.setEmail(email);

		System.out.println("\nPlease enter a Phone number" );
		String phone = in.nextLine();
		account.setPhone(phone);

		a.add(new Account(name, id, email, phone, password));
		CSVWriter.csvFileWriter(a, "User.csv");
		
		System.out.println("\nDoes this info look correct?" + "\n----------------------------------");
		System.out.println("\nUser ID: " + id + "\nName: " + name + "\nEmail: " + email + "\nPhone Number: " + phone + "\n\nPress Y for Yes and N for No"); // <- resume need to be added 
		
		String choice2 = in.nextLine();
		
		if (choice2.equalsIgnoreCase("Y")) {
			System.out.println("Great!");
			String resume;
			do {
				System.out.println("Do you need a resume?"
								 + "A. Yes"
								 + "B. Not Uploading Resume");
				resume = in.nextLine();
			}while (!resume.equalsIgnoreCase("A") && !resume.equalsIgnoreCase("B"));
			
			if (resume.equalsIgnoreCase("A")) {
					CSVWriter.writeResume(in);
			} else if (resume.equalsIgnoreCase("B")) {
				signIn();
			}
				
		  } else if (choice2.equalsIgnoreCase("N")) {
			  System.out.println("\nWhat would you like to change?" 
					  + "\nA. User ID" 
						+ "\nB. Name" 
						+ "\nC. Email" 
						+ "\nD. Phone Number");
			  
		  	}
		}


	public static void signIn() {
		System.out.println("Welcome back! \nLets get you signed in");
		System.out.println("\nPlease enter your User ID: ");
		String id = in.nextLine();
		System.out.println("\nPlease enter Password: ");
		String password = in.nextLine();
		
		/* if ( If they enter the wrong user name and password combo) {
			System.out.println("Sorry we can't find that account please create a account");
			createAccount();
				
		  } else if (if it the correct combo prints out a welcome message and goes back to the select menu) {
			 signIn();
			  
			} */
	}
	
	public static void editor() {
		// Purpose of this class if to be able to edit user info. honestly dont know if we want to include this function but im going to try to figure it out. 
		
	}
	
	public static void jobSelection() {
		// To call to the 
		// Field field = new Field();
		// field.field();
		Scanner in = new Scanner(System.in); 
		String selectionType;
	
		do {
			System.out.println("\n*********Job Selection*********");
			System.out.println("Please choose how you would like to filter your job search: "
					+ "\nA.) All jobs"
					+ "\nB.) By pay range"
					+ "\nC.) By location"
					+ "\nD.) By job field");
				selectionType = in.nextLine();
		
			System.out.println("\n*********************************{ processing........ }*********************************\n");
		} while (!selectionType.equalsIgnoreCase("A") && !selectionType.equalsIgnoreCase("B") 
				&& !selectionType.equalsIgnoreCase("C") && !selectionType.equalsIgnoreCase("D"));
	
		if (selectionType.equalsIgnoreCase("A")) {
			Jobs job = new Jobs();
			job.allJobs();
		} else  if (selectionType.equalsIgnoreCase("B")) {
			PayRange pay = new PayRange();
			pay.payRange();
		} else  if (selectionType.equalsIgnoreCase("C")) {
			Location loc = new Location();
			loc.location();
		} else {
			Field field = new Field();
			field.field();
		}
	}	
}
