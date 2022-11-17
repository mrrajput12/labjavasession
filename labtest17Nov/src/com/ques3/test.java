package com.ques3;

import java.awt.print.PrinterException;
import java.util.InputMismatchException;

public class test {
	static void number(int countnumber) throws PrinterException {
		if (countnumber <= 3) {
			throw new PrinterException("");
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			number(3);
		} catch (ArithmeticException | InputMismatchException Exception) {
			System.out.println("e.getmessage()");

		} finally {
			System.out.println();
		}
	}

}
