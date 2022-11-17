/*
 * WAP to print the stringfunction.
 * @Author: Abhishek Raj
 * @Date:17 nov 2022
 */
package com.ques2;

public class StringFunction {
	// First Function of String
	public static void main(String args[]) {
		System.out.println("---------1st Function------");
		{
			int number = 1100; // similarly we can convert another data types too

			String str = String.valueOf(number);

			System.out.println(str + 10);
		}
		System.out.println("--------2nd Function----------------");
		// Second Function of String
		{
			String s1 = "The worst thing was Love";
			String s2 = " and it always sucks. ";
			String joined_string = s1.concat(s2);
			System.out.println(joined_string); // prints the worst thing was love and it always sucks.

		}
		System.out.println("--------3rd Function----------------");

		// Third Function of String
		{
			String s1 = "Java is a programming language. Java is a platform. Java is an Object Oriented Programming Language";
			String replaceString = s1.replace("Java", "Python");// replaces all occurrences of "Java" to "Python"
			System.out.println(replaceString);
		}
		System.out.println("--------4th Function----------------");

		// fourth Function of String
		{
			String s = "Abhishek";
			System.out.println(s.toUpperCase());// ABHISHEK
			System.out.println(s.toLowerCase());// abhishek
			System.out.println(s);// Abhishek(no change in original)
		}
		System.out.println("--------5th Function----------------");

		// Fifth Function of string
		{
			String s1 = "Welcome";
			String s2 = "Back";
			System.out.println("string length is: " + s1.length());
			System.out.println("string length is: " + s2.length());

		}
		// End of Method
	}
	// End of the Class
}
//End of the Programpackage com.ques2;
