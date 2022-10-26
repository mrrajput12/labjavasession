/*
 * IT Companies tagline Class
 * @Author: Abhishek Raj
 * @Date:26 Oct 2022
 */

//declaring a package
package com.ques2;

import java.util.Scanner; //Declaring Scanner package

public class TagLine {

	//// Method to print TagLine
	static void printTag(String tag) {

		switch (tag) //// Switch case
		{
		//// Expression Level
		case "APPLE":
			System.out.println("The tagline of APPLE is:Think Different");

		case "ACCENTURE":
			System.out.println("The tagline of ACCENTURE is:Ideate,innovate,change the world,repeat");

		case "IBM":
			System.out.println("The tagline of IBM is:Think");

		case "INTEL":
			System.out.println("The tagline of INTEL is:INTEL inside");

		case "INFOSYS":
			System.out.println("The tagline of INFOSYS is:navigate Your Next");

		default:
			System.out.println("Wrong Input");
		} //// End of switch case
	} //// End of method

	//// Main Started
	public static void main(String args[])

	{
		//// Switch case with string
		String inputTag;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Company(APPLE/ACCENTUR/IBM/TCS/INFOSYS"); //// input from users
		inputTag = sc.next().toUpperCase(); //// lower to upper case

		printTag(inputTag); //// Calling method
	}/// End of main
}/// End of class
