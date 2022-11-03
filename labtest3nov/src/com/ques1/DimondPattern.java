/*
 * WAP to print the diamond pattern
 * @author:Abhishek Raj
 * @Date:3 Nov 2022
 */
package com.ques1;

//declearing class
public class DimondPattern {
	// variable decleared
	static void dimondpattern(int row) {
		int j;
		// for loop started
		for (int i = 1; i <= row; i++) {
			System.out.println();
			// inner loops for space
			for (j = row - 1; j >= i; j--) {

				System.out.print(" ");

			}
//to print the dimond pattern
			for (j = 1; j <= i; j++)

			{

				System.out.print("* ");
			}
		}
		// outer loop end
	}

//main started
	public static void main(String[] args) {
		dimondpattern(11);

	}
	// main end

}
//end of class
