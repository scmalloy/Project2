package com.skillstorm;

import java.util.ArrayList;
import java.util.Scanner;

import com.skillstorm.beans.Field;
import com.skillstorm.beans.Jobs;
import com.skillstorm.beans.Location;
import com.skillstorm.beans.PayRange;

public class JobsRUs {
	
	private static boolean signIn;
	static ArrayList<Account> a = new ArrayList<>();
	static Account account = new Account();

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Jobs R Us where we can find you a job with no problems!");
		System.out.println("Job Application Management Program" + "\n----------------------------------" );
		
		initialMenu(in);
		
	}
	public static void initialMenu(Scanner in) {
		String choice;  
		do { System.out.println("\nA. Create Account" 
	        				  + "\nB. Sign In"
	        				  + "\nC. View Jobs"  
	        				  + "\nD. Quit");
		
		choice = in.nextLine();
		} while (!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B") && 
				 !choice.equalsIgnoreCase("C") && !choice.equalsIgnoreCase("D"));
		
		if (choice.equalsIgnoreCase("A")) {
			createAccount(in);
				
		} else if (choice.equalsIgnoreCase("B")) {
			 signIn(in);
		} else if (choice.equalsIgnoreCase("C")) {
			 jobSelection(in);
		} else {
			System.out.println("Have a great day! \nGoodbye!");
		}
	}
	
	public static void menu(Scanner in) {
		String choice;  
		do { System.out.println("\nA. View Jobs" 
	        				  + "\nB. Create Resume"
	        				  + "\nC. View Account" 
	        				  + "\nD. Quit");
		
		choice = in.nextLine();
		} while (!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B") && 
				 !choice.equalsIgnoreCase("C") && !choice.equalsIgnoreCase("D"));
		
		if (choice.equalsIgnoreCase("A")) {
			jobSelection(in);
		} else if (choice.equalsIgnoreCase("B")) {
			CSVWriter.writeResume(in);
			menu(in);
		} else if (choice.equalsIgnoreCase("C")) {
			viewAccount(in);
		} else {
			System.out.println("Have a great day! \nGoodbye!");
		}	
	}
	
	public static void viewAccount(Scanner in) {
		
		System.out.println("\nUser ID: " + account.getUsername() 
						 + "\nName: " + account.getName() 
						 + "\nEmail: " + account.getEmail() 
						 + "\nPhone Number: " + account.getPhone()
						 + "\nJob Applications: " + account.getApplications().toString());
		String view;
		do {
			System.out.println("\nWould you like to edit your account or return to the main menu?"
							 + "\nA. Edit Account"
							 + "\nB. Return To Main Menu");
			view = in.nextLine();
		} while (!view.equalsIgnoreCase("A") && !view.equalsIgnoreCase("B"));
		
		if (view.equalsIgnoreCase("A")) {
			editor(in);
		} else {
			menu(in);
		}
	}
	
	public static void createAccount(Scanner in) {
		
		System.out.println("Welcome lets create your account");
		System.out.println("\nPlease pick a username");
		String username = in.nextLine();
		account.setUsername(username);
		
		System.out.println("\nPlease pick a password");
		String password = in.nextLine();
		account.setPassword(password);

		System.out.println("\nPlease enter your name.");
		String name = in.nextLine(); 
		account.setName(name);
		
		System.out.println("\nPlease enter a valid email address");
		String email = in.nextLine();
		account.setEmail(email);

		System.out.println("\nPlease enter a Phone number" );
		String phone = in.nextLine();
		account.setPhone(phone);

		a.add(new Account(username, password, name, email, phone));
		CSVWriter.csvFileWriter(a, "C:\\User\\Users.csv");
		
		editor(in);
	}

	public static void signIn(Scanner in) {
		
		System.out.println("Welcome back! \nLets get you signed in!\n");
		
		System.out.print("Enter your username: ");
        String username = in.nextLine();
        System.out.println();
        System.out.print("Enter your password: ");
        String password = in.nextLine();

        String name = CSVWriter.login(username, password);

        if (name != null) {
            System.out.println("Welcome, " + name + "!");
            setSignIn(true);
            menu(in);
        } else {
            System.out.println("Invalid username or password.");
            String sign;
            do {
				System.out.println("\nTry again or create an account."
								 + "\nA. Try Again"
								 + "\nB. Create Account");
				sign = in.nextLine();
			} while(!sign.equalsIgnoreCase("A") && !sign.equalsIgnoreCase("B"));
			if (sign.equalsIgnoreCase("A")) {
				signIn(in);
			} else {
				createAccount(in);
			}
        }
	}
	
	public static void editor(Scanner in) {
		
		String choice;
		do {
			System.out.println("\nDoes this info look correct?" + "\n----------------------------------");
			System.out.println("\nUser ID: " + account.getUsername() 
							 + "\nName: " + account.getName() 
							 + "\nEmail: " + account.getEmail() 
							 + "\nPhone Number: " + account.getPhone() 
							 + "\n\nPress Y for Yes and N for No");
			choice = in.nextLine();
		} while (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N"));
			if(choice.equalsIgnoreCase("Y")) {
				setSignIn(true);
				menu(in);
			} else {
			String edit;
			do {
				System.out.println("\nWhat would you like to change?" 
								 + "\nA. User ID" 
								 + "\nB. Name" 
								 + "\nC. Email" 
								 + "\nD. Phone Number"
								 + "\nE. No Change Needed");
				edit = in.nextLine();
			} while (!edit.equalsIgnoreCase("A") && !edit.equalsIgnoreCase("B") && 
					!edit.equalsIgnoreCase("C") && !edit.equalsIgnoreCase("D") && 
					!edit.equalsIgnoreCase("E"));
		
			if (edit.equalsIgnoreCase("A")) {
				System.out.println("Please Re-enter User ID: ");
				String id = in.nextLine();
				account.setUsername(id);
				editor(in);
			} else if (edit.equalsIgnoreCase("B")) {
				System.out.println("Please Re-enter Name: ");
				String name = in.nextLine();
				account.setName(name);
				editor(in);
			} else if (edit.equalsIgnoreCase("C")) {
				System.out.println("Please Re-enter Email: ");
				String email = in.nextLine();
				account.setEmail(email);
				editor(in);
			} else if (edit.equalsIgnoreCase("D")) {
				System.out.println("Please Re-enter Phone Number: ");
				String phone = in.nextLine();
				account.setPhone(phone);
				editor(in);
			} else {
				String choice1;
				do {
					System.out.println("\nDoes this info look correct?" + "\n----------------------------------");
					System.out.println("\nUser ID: " + account.getUsername() 
								  	 + "\nName: " + account.getName() 
								  	 + "\nEmail: " + account.getEmail() 
								  	 + "\nPhone Number: " + account.getPhone() 
								  	 + "\n\nPress Y for Yes and N for No");
					choice1 = in.nextLine();
				} while (!choice1.equalsIgnoreCase("Y") && !choice1.equalsIgnoreCase("N"));
			
				if(choice.equalsIgnoreCase("Y")) {
					setSignIn(true);
					menu(in);
				} else {
					editor(in);
				}
			}
		}
	}
	
	public static void jobSelection(Scanner in) {
		String selectionType;
	
		do {
			System.out.println("\n----------------------------- Job Selection -----------------------------");
			System.out.println("Please choose how you would like to filter your job search: "
					+ "\nA. All jobs"
					+ "\nB. By pay range"
					+ "\nC. By location"
					+ "\nD. By job field"
					+ "\nE. Return to main menu");
				selectionType = in.nextLine();
		
			System.out.println("\n----------------------------- { processing........ } -----------------------------\n");
		} while (!selectionType.equalsIgnoreCase("A") && !selectionType.equalsIgnoreCase("B") 
			  && !selectionType.equalsIgnoreCase("C") && !selectionType.equalsIgnoreCase("D")
			  && !selectionType.equalsIgnoreCase("E"));
	
		if (selectionType.equalsIgnoreCase("A")) {
			Jobs job = new Jobs();
			job.allJobs(in);
		} else  if (selectionType.equalsIgnoreCase("B")) {
			PayRange pay = new PayRange();
			pay.payRange(in);
		} else  if (selectionType.equalsIgnoreCase("C")) {
			Location loc = new Location();
			loc.location(in);
		} else if (selectionType.equalsIgnoreCase("D")) {
			Field field = new Field();
			field.field(in);
		} else {
			if (signIn == false) {
				initialMenu(in);
			} else {
				menu(in);
			}
		}
	}
	public static boolean isSignIn() {
		return signIn;
	}
	public static void setSignIn(boolean signIn) {
		JobsRUs.signIn = signIn;
	}
}
