/*
 * Wap to convert the decimal to binary number
 * @author :Abhishek Raj
 * @Date: 29 Dec 2022
 */
package com.ques1;

//class started
public class ConvertDecToBin {
	// function to convert decimal to binary
	public static void decToBinary(int n) {
		// array to store binary number
		int[] binaryNum = new int[10000];

		// counter for binary array
		int i = 0;
		while (n > 0) {
			// storing remainder in binary array
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		// printing binary array in reverse order
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}

	// driver program
	// main started
	public static void main(String[] args) {
		int n = 34;
		System.out.println("Decimal - " + n);
		System.out.print("Binary - ");
		decToBinary(n);
	}
	// end of main
}
//end of class
