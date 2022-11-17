/*
 * WAP to calculate the no .
 * @Author: Abhishek Raj
 * @Date:17 nov 2022
 */
package com.ques4;

import java.util.Scanner;

public class Calculator {
	static class Main {
		public static void main(String[] args) throws Exception {

			char operator;
			Double number1, number2, result;

			// create an object of Scanner class
			Scanner input = new Scanner(System.in);

			// ask users to enter operator
			System.out.println("Choose an operator: +, -, *, or /");
			operator = input.next().charAt(0);

			// ask users to enter numbers
			System.out.println("Enter first number");
			number1 = input.nextDouble();

			System.out.println("Enter second number");
			number2 = input.nextDouble();

			switch (operator) {

			// performs addition between numbers
			case '+':
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
				break;

			// performs subtraction between numbers
			case '-':
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
				break;

			// performs multiplication between numbers
			case '*':
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
				break;

			// performs division between numbers
			case '/':
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + result);
				break;

			default:
				System.out.println("Invalid operator!");
				break;
			}

			input.close();
			int i = 0;
			if (i > 0) {
				throw new Exception("");

			}
			try {
				CheckNumber(3);

			} catch (ArithmeticException exception) {
				System.out.println("exception");
			}
		}

		public static void CheckNumber(int i) {

		}
	}
}
