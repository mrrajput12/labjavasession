/*
 * Wap to print the Reverse string without using Stringbuffer and StringBuilder
 * @author :Abhishek Raj
 * @Date: 29 Dec 2022
 */
package com.ques3;

//class started
public class ReverseString {
	// main started
	public static void main(String args[]) {

		// Reverse String in Java without Using StringBuffer or StringBuilder
		String str = "Abhishek on Java";
		String reverse = reverse(str);
		System.out.printf(" original String : %s , reversed String %s %n", str, reverse);
	}

	public static String reverse(String source) {
		if (source == null || source.isEmpty()) {
			return source;
		}
		String reverse = "";
		for (int i = source.length() - 1; i >= 0; i--) {
			reverse = reverse + source.charAt(i);
		}

		return reverse;
	}
//end of main
}
//end of class