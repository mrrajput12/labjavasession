/*Wap to print the prime number 
 * @Author: Abhishek Raj
 * @date: 22 dec 2022
 */
package com.ques1;

//importing scanner
import java.util.Scanner;

//class started
public class PrimeNumber {
	// main started
	public static void main(String args[]) {
		int num, b, c;
		// importing scanner
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter A Number");
			num = s.nextInt();
		}
		b = 1;
		c = 0;
		// while loop
		while (b <= num) {
			if ((num % b) == 0)
				c = c + 1;
			b++;
		}
		// if case started
		if (c == 2)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
	// end of main
}
//end of class
