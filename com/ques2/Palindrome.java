/*Wap to print the Pallindrome 
 * @Author: Abhishek Raj
 * @date: 22 dec 2022
 */
package com.ques2;

//import
import java.util.Scanner;

//class started
public class Palindrome {
//main started
	public static void main(String[] args) {
		// Objects of String class
		String original, reverse = "";
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		// for lopp started
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered number is a palindrome.");
		else
			System.out.println("Entered number is not a palindrome.");
	}
	// end of main
}
//end of class