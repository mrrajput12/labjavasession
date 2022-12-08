/* wap to print the id name
 * @author :abhishek raj
 * @date :8 dec 2022
 */
package com.ques2;

//importing package
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//declearing a class
public class Idname {
//main started
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// making map
		Map<Integer, String> m = new TreeMap<>();
		// taking id from user
		System.out.println("Enter the Id(345-351)");
		int num = sc.nextInt();
		// putting keys and values inside the maps
		m.put(345, "Abhishek");
		m.put(346, "Rahul");
		m.put(347, "Amit");
		m.put(348, "Anil");
		m.put(349, "Sunil");
		m.put(350, "Suraj");
		m.put(351, "Sourav");
		//// System.out.println(m.entrySet());
		System.out.println("The Student name is: " + m.get(num)); //// getting the values of the id given by the user
	}
	// end of main
}
//end oof class