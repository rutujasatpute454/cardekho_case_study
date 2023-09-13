package com.jspiders.cardekho_case_study.main;

import java.util.Scanner;

import com.jspiders.cardekho_case_study.operation.CarOperation;

public class CarDekhoMenu {

	private static CarOperation operation= new CarOperation();
	private static boolean loop=true;
	
	public static void main(String[] args) {
		while (loop) {
			carDekhoMenu();
		}
	}
	private static void carDekhoMenu() {
		System.out.println("==========MENU==========\n"
				                 +"1.Add/Remove Car Details \n"
				                 +"2.Search Car Details \n"
				                 +"3. Edit Car Details \n"
				                 +"4.Exit");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Choice :");
		int choice1=scanner.nextInt();
		switch(choice1) {
		case 1:System.out.println("==========MENU==========\n"
				                 +"1.Add Car Details\n"
				                 +"2.Remove Car Details\n"
				                 +"3.Go Back to Main Menu");
		
		System.out.println("Enter Your Choice :");
		int choice2=scanner.nextInt();
		switch(choice2) {
		case 1:
			   operation.addCarDetails();
		       break;
		case 2:
			operation.removeCarDetails();
			break;
		case 3:
			 carDekhoMenu();
			 break;
		default:
			System.out.println("\nInvalid Choice.Try Again..!!!");
			break;
		}
		break;
		case 2:
			System.out.println("==========MENU==========\n"
					                  +"1.Search car By Name\n"
					                  +"2.Search car By Brand\n"
					                  +"3.Search car By Fuel Type\\n"
					                  +"4.Search All Cars\\n"
					                  +"5.Go Back to Main Menu\n");
			int choice3=scanner.nextInt();
			switch (choice3) {
			case 1:
				operation.searchByName();
				break;
			case 2:
				operation.searchByBrand();
				break;
			case 3:
				operation.searchByFuelType();
				break;
			case 4:
				operation.getAllCarDetails();
				break;
			case 5:
				carDekhoMenu();
				break;

			default:
				System.out.println("\nInvalid Choice.Try Again...!!");
				break;
			}
			break;
		case 3:
			operation.editCarDetails();
			break;
		case 4:
			System.out.println("Thank You...!!!");
			loop=false;
			scanner.close();
			break;
			
		default:
			System.out.println("\nInvalid Choice.Try Again...!!!");
			break;
		
		
		}
	}

}
