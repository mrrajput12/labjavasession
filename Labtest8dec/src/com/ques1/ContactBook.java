/* wap to print the contactbook
 * @author :abhishek raj
 * @date :8 dec 2022
 */
package com.ques1;

//importing pacakage
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//declearing a class
public class ContactBook {
//main started
	public static void main(String[] args) {
		// creating three sets
		Set<String> s1 = new TreeSet<>();
		Set<String> s2 = new TreeSet<>();
		Set<String> s3 = new TreeSet<>();
//taking inputs by the users
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name,Phone no,Email ID");
		String n1 = sc.next();
		String p1 = sc.next();
		String e1 = sc.next();
		System.out.println("Enter Name,Phone no,Email ID");
		String n2 = sc.next();
		String p2 = sc.next();
		String e2 = sc.next();
		System.out.println("Enter Name,Phone no,Email ID");
		String n3 = sc.next();
		String p3 = sc.next();
		String e3 = sc.next();
//addingg the detasils
		s1.add(n1);
		s1.add(p1);
		s1.add(e1);
		s2.add(n2);
		s2.add(p2);
		s2.add(e2);
		s3.add(n3);
		s3.add(p3);
		s3.add(e3);
//printing the deatils
		System.out.println("---------The Details Are------------"); //// Printing the details
		System.out.println("[PhoneNumber,Name,  Email]");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
//end of main
}
//end of class