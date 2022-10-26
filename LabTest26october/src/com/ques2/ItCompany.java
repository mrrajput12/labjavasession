/*to know the slogan of the it companies
 * @author: Abhishek Raj
 * @Date: 26 oct 2022
 */
package com.ques2;

//importing Package
import java.util.Scanner;

//creating class
public class ItCompany {
	private static Scanner sc;

	// method for tag
	static void PrintTag(String Tag) {
//switch case
		switch (Tag)

		{
		case "Adobe":System.out.println("Better by Adobe");

		case "Accenture":System.out.println("High Performance Delivered");

		case "BMW ":System.out.println("The Ultimate Driving machine");

		case "IBM ":System.out.println("We make it Happen");

		default:System.out.println("Wrong Input");
		}// end of Switch
	}// end of tag
//main method

	public static void main(String[] args) {
		String inputTag;
		sc = new Scanner(System.in);
//taking input
		System.out.println("Enter the It company (Adobe/Accenture/BMW/IBM):");

		inputTag = sc.next().toUpperCase();

		PrintTag(inputTag);

	}
	// end of main
}
// end of class