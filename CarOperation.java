package com.jspiders.cardekho_case_study.operation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import com.jspiders.cardekho_case_study_entity.Car;

public class CarOperation {

	private List<Car> cars=new ArrayList<Car>();
	
	public void addCarDetails() {
		System.out.println("How Many car Details do You want to Add?");
		Scanner scanner=new Scanner(System.in);
		int choice= scanner.nextInt();
		for(int i=1;i<=choice;i++) {
			Car car=new Car();
			System.out.println("Enter Car Id  : ");
			car.setCar_id(scanner.nextInt());
			System.out.println("Enter Car Name  : ");
			car.setName(scanner.next());
			System.out.println("Enter Car Brand  : ");
			car.setBrand(scanner.next());
			System.out.println("Enter Car Fuel Type  : ");
			car.setFuel_type(scanner.next());
			System.out.println("Enter Car Price  : ");
			car.setPrice(scanner.nextDouble());
			cars.add(car);
			System.out.println("\n\n"+car.getName()+"Added...!!!");
		}
		getAllCarDetails();
	}
	public void removeCarDetails() {
		getAllCarDetails();
		if (cars.isEmpty()==false) {
			Car car1=null;
			System.out.println("\n Enter Car_id To Remove :");
			Scanner scanner=new Scanner(System.in);
			int choice=scanner.nextInt();
			for(Car car:cars) {
				if (car.getCar_id()==choice) {
					car1=car;
				}
				
			}
			if (car1!=null) {
				cars.remove(car1);
				System.out.println(car1.getName()+"Removed..!!!");
			}
			else {
				System.out.println("Invalid Choice.Try again..!!!");
			}
			
			
		}
	}
	public void getAllCarDetails() {
		if (cars.isEmpty()) {
			System.out.println("No car Details Found...!!");
		}
		else {
			System.out.println("Total car Details :"+cars.size());
			System.out.println("ID\t"+"Name\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("==============================================");
			for(Car car:cars) {
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getBrand()+"\t"
						+car.getFuel_type()+"\t"+car.getPrice());
			}
		}
	}
	public void searchByName() {
		if (cars.isEmpty()) {
			System.out.println("No Car Detais Found..!!!");
		}
		else {
			System.out.println("Enter Car Name :");
			Scanner scanner=new Scanner(System.in);
            String name=scanner.next();
            List<Car> allCars=new ArrayList<Car>();
            for(Car car:cars) {
            	if (car.getName().equalsIgnoreCase(name)) {
					allCars.add(car);
				}
            }
            System.out.println("Total car Details :"+allCars.size());
            System.out.println("ID\t"+"Name\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("==============================================");
			for(Car car:allCars) {
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getBrand()+"\t"
						        +car.getFuel_type()+"\t"+car.getPrice());
			}
            
		}
	}
	public void searchByBrand() {
		if (cars.isEmpty()) {
			System.out.println("No Car Detais Found..!!!");
		}
		else {
			System.out.println("Enter Car Brand :");
			Scanner scanner=new Scanner(System.in);
            String brand=scanner.next();
            List<Car> allCars=new ArrayList<Car>();
            for(Car car:cars) {
            	if (car.getBrand().equalsIgnoreCase(brand)) {
					allCars.add(car);
				}
            }
            System.out.println("Total car Details :"+allCars.size());
            System.out.println("ID\t"+"Name\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("==============================================");
			for(Car car:allCars) {
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getBrand()+"\t"
						        +car.getFuel_type()+"\t"+car.getPrice());
			}
            
		}
	}
	public void searchByFuelType() {
		if (cars.isEmpty()) {
			System.out.println("No Car Detais Found..!!!");
		}
		else {
			System.out.println("Enter Car Fuel Type :");
			Scanner scanner=new Scanner(System.in);
            String fuel_type=scanner.next();
            List<Car> allCars=new ArrayList<Car>();
            for(Car car:cars) {
            	if (car.getFuel_type().equalsIgnoreCase(fuel_type)) {
					allCars.add(car);
				}
            }
            System.out.println("Total car Details :"+allCars.size());
            System.out.println("ID\t"+"Name\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("==============================================");
			for(Car car:allCars) {
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getBrand()+"\t"
						        +car.getFuel_type()+"\t"+car.getPrice());
			}
            
		}
	}
	public void editCarDetails() {
	if (cars.isEmpty()==false) {
		System.out.println("Enter Car id to Update :");
		Scanner scanner=new Scanner(System.in);
		int car_id=scanner.nextInt();
		for(Car car:cars) {
			if (car.getCar_id()==car_id) {
		
				System.out.println("Enter Car Name  : ");
				car.setName(scanner.next());
				System.out.println("Enter Car Brand  : ");
				car.setBrand(scanner.next());
				System.out.println("Enter Car Fuel Type  : ");
				car.setFuel_type(scanner.next());
				System.out.println("Enter Car Price  : ");
				car.setPrice(scanner.nextDouble());
				cars.add(car);
				System.out.println("Car Details Updated...!!!");
			}
		}
	}
}
	
}
