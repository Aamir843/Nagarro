package com.nagarro.java.assignment;

import java.util.*;

public class CarInsurance {

	public static void main(String[] args) {
		char choice;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("Enter car type.");
				String carType = sc.next();

				System.out.println("Enter the cost of the car");
				double carCost = sc.nextDouble();

				System.out.println("Enter insurance type. Basic or Premium");
				String insuranceType = sc.next();

				calculateInsurance(carType, carCost, insuranceType);

				System.out.println("\nDo you want to enter details of any other car (y/n):");
				choice = sc.next().charAt(0);
			} while (choice == 'Y' || choice == 'y');
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}

	}

	public static void calculateInsurance(String carType, double carCost, String insuranceType) {
		double insurancePremium = 0;

		if (carType.equalsIgnoreCase("Hatchback")) {
			insurancePremium = 0.05 * carCost;
		} else if (carType.equalsIgnoreCase("Sedan")) {
			insurancePremium = 0.08 * carCost;
		} else if (carType.equalsIgnoreCase("SUV")) {
			insurancePremium = 0.10 * carCost;
		} else {
			System.out.println("Car Type can only be Hatchback, Sedan or SUV");
		}

		System.out.println("Car Type: " + carType);
		System.out.println("Car Price: " + carCost);

		if (insuranceType.equalsIgnoreCase("Premium")) {
			System.out.println("\nTotal Insurance: " + (insurancePremium + insurancePremium * 0.2));
		} else if (insuranceType.equalsIgnoreCase("Basic")) {
			System.out.println("Total Insurance: " + insurancePremium);
		} else {
			System.out.println("\nPlease input the correct insurance Type. Either Basic or Premium");
		}

	}

}
