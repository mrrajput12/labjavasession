/*
 * wap to print the hotel deatils 
 * @author:Abhishek Raj
 * @date:3 Nov 2022
 */
package com.ques3;

import java.util.Scanner;

//declaring a class
public class PiggiBank {
	// main started
	public static void main(String[] arg) {
		int choice1 = 0, mul = 0;
		double mul2 = 0.0;
		Scanner in = new Scanner(System.in);
		PiggiBank pb = new PiggiBank();
		do {
			System.out.println("");
			System.out.println(" 1. Show total in bank ");
			System.out.println(" 2. Add a nickel");
			System.out.println(" 3. Add a dime");
			System.out.println(" 4. Add a Quater");
			System.out.println(" 5. Tale a money out of the bank");
			System.out.print(" Enter 0 to quit. ");
			System.out.print(" Enter Your Choice: ");
			choice1 = in.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("");
				pb.ShowTotal();
				break;

			case 2:
				System.out.println("");
				System.out.print("Enter Number of Nickel to add : ");
				mul = in.nextInt();
				pb.AddNickel(mul);
				break;

			case 3:
				System.out.println("");
				System.out.print("Enter Number of Dime to add : ");
				mul = in.nextInt();
				pb.AddDime(mul);
				break;

			case 4:
				System.out.println("");
				System.out.print("Enter Number of quarter to add : ");
				mul = in.nextInt();
				pb.AddQuarter(mul);
				break;

			case 5:
				System.out.println("");
				System.out.print("Enter Amount to withdraw : ");
				mul2 = in.nextDouble();
				pb.Withdraw(mul2);
				break;
			case 0:
				System.out.println("");
				System.out.print("END PROGRAM !! ");
				break;
			default:
				System.out.println("Wronge Choice,try again !");
			}
		} while (choice1 != 0);
		// end of main

	}
	// end of class

	private void ShowTotal() {
		// TODO Auto-generated method stub

	}

	private void AddNickel(int mul) {
		// TODO Auto-generated method stub

	}

	private void AddDime(int mul) {
		// TODO Auto-generated method stub

	}

	private void AddQuarter(int mul) {
		// TODO Auto-generated method stub

	}

	private void Withdraw(double mul2) {
		// TODO Auto-generated method stub

	}
}
