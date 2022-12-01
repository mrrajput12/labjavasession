/*wap to print the tictac game
 * @author:Abhishek raj
 * @date :1st dec 2022
 */
package com.ques1;

//importing
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

//declaering a class
public class game {

	static Scanner sc = new Scanner(System.in);

	private static final String perc = sc.nextLine(); //// Entering the Percentage in String Format

	void file() throws IOException { //// use of throws keyward
		@SuppressWarnings("resource")
		OutputStream os = new FileOutputStream("C:\\Users\\Abhishek\\Desktop\\CoreJava//TicTac Percentage.txt");//// Saving
																												//// the
																												//// percentage
																												//// at
																												//// CoreJava
																												//// fold
		byte[] p = perc.getBytes(); //// Converting into bytes
		os.write(p);
		throw new IOException("Successfully done");
	}

//main started
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		game tt = new game();
		try {
			tt.file(); ///// Try catch method used
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("1: Play"); ///// The menu of the game
		System.out.println("2: View the instruction");
		System.out.println("3: View the Win Percentage");
		System.out.println("4: Exit");

		int choice = sc.nextInt();
		switch (choice) { //// Switch case used
		case 1:
			System.out.println("Starting the game.....");
		case 2:
			System.out.println("Instructions are.....");
		case 3:
			System.out.println("Your win percentage is... " + perc);

		case 4:
			sc.close();
		default:
			System.out.println("Wrong Input");

		}

	}
	// end of main

} //// end of class