package com.ques5;

import java.util.Scanner;

//declaring a class

public class CarModelExample

{
	// main started

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many records do you want to register: ");
		int record = scan.nextInt();

		CarRegistrationListing car = new CarRegistrationListing(1000, "", 0, "", "", 0, "", "", 0.0);

		for (int i = 0; i < record; i++) {
			String[] carType = { "Toyota Vios", "Nissan Teana", "Honda City" };
			System.out.println("Car Type:");
			for (String carType1 : carType) {
				System.out.println(carType1);
			}
			// taking input

			System.out.print("Choose your car type(1 to 3): ");
			int type = scan.nextInt();
			String make;
			String model;
			switch (type) {
			case 1:
				make = "Toyota";
				model = "Vios";
				break;

			case 2:
				make = "Nissan";
				model = "Teana";
				break;

			default:
				make = "Honda";
				model = "City";
				break;

			}

			System.out.print("Enter name: ");
			String name = scan.nextLine();
			car.setName(name);
			scan.nextLine();
			System.out.print("Enter IC number: ");
			int icNo = scan.nextInt();
			car.setIcNo(icNo);
			System.out.print("Enter plate number: ");
			String plateNo = scan.next();
			car.setPlateNo(plateNo);
			System.out.print("Enter color: ");
			String color = scan.next();
			car.setColor(color);
			System.out.print("Enter year: ");
			int year = scan.nextInt();
			car.setYear(year);
			car.setMake(make);
			car.setModel(model);
			System.out.print("Enter capacity: ");
			double capacity = scan.nextDouble();
			car.setCapacity(capacity);
		}

		System.out.println("Car Registration Listing");
		for (int i = 0; i < record; i++) {
			System.out.println("Reg No.\tName\t\tIC No.\tPlate No.\tColor\tYear\tMake\tModel\tCapacity");
			System.out.println(car.getRegNo() + "\t" + car.getName() + "\t\t" + car.getIcNo() + "\t" + car.getPlateNo()
					+ "\t\t" + car.getColor() + "\t" + car.getYear() + "\t" + car.getMake() + "\t" + car.getModel()
					+ "\t" + car.getCapacity());
		}
		// end of class

	}
}
//end of mainpackage com.ques5;
