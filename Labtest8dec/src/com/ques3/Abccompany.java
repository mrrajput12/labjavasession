/* wap to print the company detials
 * @author :abhishek raj
 * @date :8 dec 2022
 */
package com.ques3;

//importing package
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//declearing a class
public class Abccompany {
//main started
	public static void main(String[] args) { //// main started
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// maing a maps
		Map<String, Integer> m = new TreeMap<>();
		// Putting names & years of work inside the map
		m.put("Abhishek", 1);
		m.put("Rahul", 5);
		m.put("Amit", 6);
		m.put("ANIL", 4);
		m.put("Sunil", 1);
		m.put("Suraj", 5);
		m.put("sourav", 2);
		// Getting the name of employee by the company
		System.out.println("Enter the name of the Employee");
		String name = sc.next().toUpperCase();
		int y = m.get(name);
		// Getting the name of employee by the company
		if (y > 2) {
			System.out.println("Congratulations,You have achieved the 10% Salary increment.");
		} else {
			System.out.print("You have to work " + (2 - y) + " year/years more to get this increment");
		}
	}
//end of main
}
//end of class