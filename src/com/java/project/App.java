package com.java.project;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int businessId = 0;
		int customerId = 0;
		int addressId = 0;
		boolean isRunning = true;
		int option;
		System.out.println("################# BUSINESS MANAGER ################");
		Scanner sc = new Scanner(System.in);
		BusinessManager manager = new BusinessManager();
		while(isRunning) {
			App.displayMenuOptions();
			option = sc.nextInt();
			switch(option) {
			case 1:
				manager.createBusiness();
			}
		}
	}
	
	public static void displayMenuOptions() {
		System.out.println("Choose an option from below menu:");
		System.out.println("1. Create a business");
		System.out.println("2. Read business details");
		System.out.println("3. Update business details");
		System.out.println("4. Delete business details");
		System.out.println("5. Quit Program");
	}
}
