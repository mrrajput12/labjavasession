/*Wap to print the implement the class
 * @Author: Abhishek Raj
 * @date: 22 dec 2022
 */
package com.ques4;

//class test2 started
public class Test2 {
	// main started
	public static void main(String[] agrs) {
		// taking input
		// Making object of Manager Class
		// giving details
		Manager m = new Manager();
		m.name = "Rahul Pandey";
		m.phone = "832457859";
		m.address = "Mumbai";
		m.salary = 85000;
		// giving details
		// making Employee class
		Employee e = new Employee();
		e.name = "Abhishek Raj";
		e.age = 25;
		e.phone = "7759084327";
		e.address = "Ranchi";
		e.salary = 40000;
		// printing the manager details
		System.out.println("------------Manager Details--------------");
		System.out.println("Name: " + m.name);
		System.out.println("Age: " + m.age);
		System.out.println("Phone Number: " + m.phone);
		System.out.println("Adress: " + m.address);
		System.out.println("Salary: " + m.salary);
		// printing the employee details
		System.out.println("------------Employee Details--------------");
		System.out.println("Name: " + e.name);
		System.out.println("Age: " + e.age);
		System.out.println("Phone Number: " + e.phone);
		System.out.println("Adress: " + e.address);
		System.out.println("Salary: " + e.salary);
	}
	// end of main

}
//end of class