/*Wap to print the product Details 
 * @Author: Abhishek Raj
 * @date: 15 dec 2022
 */
package com.ques1;

//importing the package
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

//class started
public class ProductDetail {
	void file() throws IOException {
		// Scanner started
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("resource")
		// giving thr location field and name
		OutputStream os = new FileOutputStream("E:\\New folder//ProductDetails.txt");
		String ID;
		String name;
		String price;
		// taking products details by the users
		System.out.println("Enter the product Id");
		ID = sc.nextLine();

		System.out.println("Enter the product name");
		name = sc.nextLine();

		System.out.println("Enter the product price");
		price = sc.nextLine();
		// Accept only byte
		byte[] a = ID.getBytes();
		byte[] b = name.getBytes();
		byte[] c = price.getBytes();

		os.write(a);
		os.write(b);
		os.write(c);
	}

//main started
	public static void main(String[] args) {
//creating object
		ProductDetail od = new ProductDetail();
		// calling the method
		try {
			od.file();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// end of main
}
//end of class
