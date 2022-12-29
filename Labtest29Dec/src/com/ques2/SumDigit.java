/*
 * Wap to print the sum of digits
 * @author :Abhishek Raj
 * @Date: 29 Dec 2022
 */
package com.ques2;

//importing
import java.util.Scanner;

//class started
public class SumDigit {
	// main started
	public static void main(String[] args) {
		int m, n, sum = 0;
		// importing scanner
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// inserting the number
		System.out.println("Enter a number:");
		m = sc.nextInt();
		// while used
		while (m > 0) {
			n = m % 10;
			sum = sum + n;
			m = m / 10;
		}
		// printing the sum
		System.out.println("sum of digits:" + sum);

	}
	// end of main
}
//end of class
